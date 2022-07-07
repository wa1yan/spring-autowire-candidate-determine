package com.waiyanhtet.demo;

import org.springframework.stereotype.Component;

import com.waiyanhtet.customqualifier.AppServices;
import com.waiyanhtet.customqualifier.AppServices.Type;

@Component
public class AppClient {

	private AppService appService;
	
	public AppClient(@AppServices(Type.ONE) AppService appService) {
		super();
		this.appService = appService;
	}


	public AppService getAppService() {
		return appService;
	}

}
