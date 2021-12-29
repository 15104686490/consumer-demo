package com.demo.consumer.demo.controller;

import com.test.srpingdemo.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzy
 * @create 2021/12/29 10:15
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    TestService testService;

    @GetMapping("/getMethod")
    public String testGetMethod() {

        //return "ok!!";
        System.out.println("dubbo");
        return testService.sayHi("hello!!");
    }

}
