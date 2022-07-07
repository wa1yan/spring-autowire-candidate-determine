package com.waiyanhtet.config;

import java.nio.channels.NonReadableChannelException;
import java.util.Set;

import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.waiyanhtet.customqualifier.AppServices;
import com.waiyanhtet.customqualifier.AppServices.Type;
import com.waiyanhtet.customqualifier.ServiceTwo;
import com.waiyanhtet.demo.AppClient;
import com.waiyanhtet.demo.AppService;

@Configuration
@ImportResource("classpath:app-config.xml")
@ComponentScan(basePackages = "com.waiyanhtet.demo")
public class AppConfig {

	@Bean
	AppClient appClient(@AppServices(Type.THREE) AppService appService) {
		return new AppClient(appService);
	}
	
	@Bean
	static CustomAutowireConfigurer configurer() {
		var configurer = new CustomAutowireConfigurer();
		configurer.setCustomQualifierTypes(Set.of(
				ServiceTwo.class
				));
		return configurer;
	}

}
