package com.myspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class HelloServiceTest {

    @org.junit.Test
    public void sayHello() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService helloService = context.getBean("helloService", HelloService.class);
        helloService.sayHello();
    }
}