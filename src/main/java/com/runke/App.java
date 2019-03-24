package com.runke;

import com.runke.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        IUserService userService = (IUserService) classPathXmlApplicationContext.getBean("userService");
        userService.getUser();

    }
}
