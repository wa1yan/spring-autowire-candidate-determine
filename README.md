# Spring Autowire Candidate Determine
This is spring project about determining bean candidate to avoid NoUniqueBeanDefinitionException

To avoid NoUniqueBeanDefinitionException, 
### Can use autowire-candidate = false  
  > can use autowire-candidate = false in xml file's bean tag

### Can use @Qulifier or custom qualifier

### Can use @Primary or primary in xml file's bean

### Can use @Priority (javax.annotation only)

### Can use same name such as bean name and argument name 

### @Qualifier Usage

> main branch is using annotaion config only 

> annoation-xml-java-configuration branch is using combine all configuration 

> custom-qualifier-with-all-configuration branch is using combine all configuration but used custom qualifier

> custom-qualifier-with-annotation-abstraction is using annotation configuration only and used annotation abstraction with enum type.
