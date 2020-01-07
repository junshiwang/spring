package com.junshi;

import com.junshi.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.junshi.service.A;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        A a  = (A) applicationContext.getBean("a");
        a.say();
    }
}