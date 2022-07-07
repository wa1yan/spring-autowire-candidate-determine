package com.waiyanhtet.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("two")
public class AppServiceTwo implements AppService {

}
