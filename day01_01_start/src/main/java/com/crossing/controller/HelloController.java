package com.crossing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 */
@Controller("helloController")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String hello(){
        System.out.println("hello SpringMVC");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("test RequestMapping");
        return "success";
    }
}
