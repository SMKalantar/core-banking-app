package com.banking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bank bank = (Bank) context.getBean("bank");
        System.out.println(bank.getAccount(12345L));
    }
}
