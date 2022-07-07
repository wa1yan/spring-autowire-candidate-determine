package com.waiyanhtet.demo;

public class AppClient {

	private AppService appService;
	
	public AppClient(AppService appService) {
		super();
		this.appService = appService;
	}


	public AppService getAppService() {
		return appService;
	}

}
