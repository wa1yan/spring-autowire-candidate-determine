package com.waiyanhtet.demo;

import java.util.Set;

import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.stereotype.Component;

import com.waiyanhtet.customqualifier.ServiceOne;
import com.waiyanhtet.customqualifier.ServiceTwo;

@Component
public class CustomQualifierRegistrationBean extends CustomAutowireConfigurer {

	public CustomQualifierRegistrationBean() {
		setCustomQualifierTypes(Set.of(
			ServiceOne.class,
			ServiceTwo.class
		));
		}
}
