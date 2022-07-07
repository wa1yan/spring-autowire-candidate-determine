# spring-autowire-candidate-determine
This is spring project about determining bean candidate to avoid NoUniqueBeanDefinitionException


> This branch used custom annotation and custom qualifier

      @Retention(RUNTIME)
      @Target({ TYPE, PARAMETER })
      public @interface ServiceTwo {

      }
Firstly, created custom annotaion 
  ServiceOne
  ServiceTwo
  ServiceThree
  
And need to be a bean so, we can configure bean definition with three ways.
  For example, this is AppServiceTwo
  
  XMl Configuration
  
        <bean name="two" class="com.waiyanhtet.demo.AppServiceTwo">
		      <qualifier type="com.waiyanhtet.customqualifier.ServiceTwo"></qualifier>
	      </bean>

        <bean class="org.springframework.beans.factory.annotation.CustomAutowireConfigurer">
          <property name="customQualifierTypes">
            <set>
              <value>com.waiyanhtet.customqualifier.ServiceTwo</value>
            </set>
          </property>
        </bean>
        
   Annotation Configuration
   
        @Component
        public class CustomQualifierRegistrationBean extends CustomAutowireConfigurer {

          public CustomQualifierRegistrationBean() {
            setCustomQualifierTypes(Set.of(
              ServiceTwo.class
            ));
            }
        }
        
   Java Configuration
   
        @Bean
        static CustomAutowireConfigurer configurer() {
          var configurer = new CustomAutowireConfigurer();
          configurer.setCustomQualifierTypes(Set.of(
              ServiceTwo.class
              ));
          return configurer;
        }
        
  But can do easily without CustomAutowireConfigurer by add @Qualifier
    
      @Retention(RUNTIME)
      @Target({ TYPE, PARAMETER })
      @Qualifier
      public @interface ServiceThree {

      }
      
      @Component
      @ServiceThree
      public class AppServiceThree implements AppService {

      }
