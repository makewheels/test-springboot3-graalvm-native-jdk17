package com.example.testspringboot3graalvmnativejdk17;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {
    @RequestMapping("hello")
    public String hello() {
        return "hello-from-test-springboot3-graalvm-native-jdk17-"
                + System.currentTimeMillis();
    }
}
