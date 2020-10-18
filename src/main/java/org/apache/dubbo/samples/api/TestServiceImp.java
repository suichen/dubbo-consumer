package org.apache.dubbo.samples.api;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//@Service
public class TestServiceImp implements TestSerice{

    @Reference(version = "1.0.0")
    private GreetingsService greetingsService;
    @Reference(version = "1.0.0")
    private HelloService helloService;

    public String sayHi(String name) {
        return null;
    }

}
