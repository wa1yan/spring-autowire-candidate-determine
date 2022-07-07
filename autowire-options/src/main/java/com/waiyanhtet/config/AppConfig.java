package com.waiyanhtet.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.waiyanhtet.demo.AppClient;
import com.waiyanhtet.demo.AppService;
import com.waiyanhtet.demo.AppServiceThree;

@Configuration
@ImportResource("classpath:app-config.xml")
public class AppConfig {

	@Bean
	AppClient appClient(@Qualifier("one") AppService appService) {
		return new AppClient(appService);
	}
	
	@Bean
	@Qualifier("three")
	AppServiceThree appServiceThree() {
		return new AppServiceThree();
	}

}
