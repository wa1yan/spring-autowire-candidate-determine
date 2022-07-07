package com.waiyanhtet.demo;

import org.springframework.stereotype.Component;

import com.waiyanhtet.customqualifier.AppServices;
import com.waiyanhtet.customqualifier.AppServices.Type;

@Component
@AppServices(Type.THREE)
public class AppServiceThree implements AppService {

}
