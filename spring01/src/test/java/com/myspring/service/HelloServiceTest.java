package com.myspring.service;

import com.myspring.service.HelloService;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceTest {
    ClassPathXmlApplicationContext context = null;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @org.junit.Test
    public void sayHello() {
        HelloService helloService = context.getBean("helloService", HelloService.class);
        helloService.sayHello();
    }
}