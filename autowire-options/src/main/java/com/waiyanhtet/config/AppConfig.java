package com.waiyanhtet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.waiyanhtet.customqualifier.ServiceThree;
import com.waiyanhtet.demo.AppClient;
import com.waiyanhtet.demo.AppService;

@Configuration
@ImportResource("classpath:app-config.xml")
@ComponentScan(basePackages = "com.waiyanhtet.demo")
public class AppConfig {

	@Bean
	AppClient appClient(@ServiceThree AppService appService) {
		return new AppClient(appService);
	}

}
