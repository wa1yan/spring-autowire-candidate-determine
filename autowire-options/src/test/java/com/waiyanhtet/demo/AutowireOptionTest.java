package com.waiyanhtet.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireOptionTest {

	@Test
	void test() {
		try (var context = new AnnotationConfigApplicationContext()) {
			// context.register(AppConfig.class);
			// context.load("classpath:app-config.xml");
			 context.scan("com.waiyanhtet.demo");
			context.refresh();
			var bean = context.getBean(AppClient.class);
			System.out.println(bean.getAppService().getClass());
		}
	}
}
