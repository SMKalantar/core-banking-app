package com.banking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBean hello = (HelloBean) context.getBean("helloBean");
        System.out.println(hello.getMessage());
    }
}
