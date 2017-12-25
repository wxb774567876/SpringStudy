package com.learn.a01_Spring初学快速入门.spring.impl;

import com.learn.a01_Spring初学快速入门.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld {
    public void sayHello() {
        System.out.println("Spring 说你好！");
    }
}
