package com.waiyanhtet.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AppClient {
	

	private AppService appService;

	@Autowired
	public void setAppService(@Qualifier("two") AppService service){
		appService = service;
	}
	
	public AppService getAppService() {
		return appService;
	}

}
