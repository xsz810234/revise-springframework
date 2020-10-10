package com.study.spring.ioc.demo;

import com.study.spring.ioc.service.IOCService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCDemo {
    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-ioc.xml");
        IOCService iocService=(IOCService)context.getBean("iocservice");
        System.out.println(iocService.hello());
    }
}
