package com.learn.a01_Spring初学快速入门.spring.helloworld;

public class HelloWorldService {
    private HelloWorld helloWorld;

    public HelloWorldService () {

    }

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }
}
