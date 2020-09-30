package com.study.spring.ioc.demo;

import com.study.spring.ioc.service.IOCService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCDemo {
    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-ioc.xml");
        IOCService iocService=context.getBean(IOCService.class);
        System.out.println(iocService.hello());
        System.out.println(iocService.hello()+" i want to go to firstBranch");
        System.out.println("just i want to learn how to use git ");
    }
}
