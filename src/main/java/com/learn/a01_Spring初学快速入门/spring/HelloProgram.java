package com.learn.a01_Spring初学快速入门.spring;

import com.learn.a01_Spring初学快速入门.spring.helloworld.HelloWorld;
import com.learn.a01_Spring初学快速入门.spring.helloworld.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloProgram {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/learn/a01_Spring初学快速入门/spring/beans.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        HelloWorld helloWorld = helloWorldService.getHelloWorld();
        helloWorld.sayHello();
    }
}
