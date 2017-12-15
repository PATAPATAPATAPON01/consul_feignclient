package com.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: za-lvjian
 * Date: 2017/12/15 14:54
 * DESC:
 */
@RestController
public class HelloController {


    @Autowired
    private HelloClient helloClient;

    @GetMapping("/feigntest")
    public String invoke() {
        System.out.println(helloClient.findStudentByName("lvjian"));
        return "feign invoke success";
    }

    @GetMapping("/health2")
    public String invoke2() {
        System.out.println("2222222222222222222");
        return "feign invoke success";
    }
}
