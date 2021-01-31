package com.example.springplus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//web demo
@RestController
public class HelloSpringBoot {
    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring (){
        System.out.println("hello spring boot");
        return "hello spring boot";
    }
    @RequestMapping(path = {"/getPOJO"})
    public String getPOJO (){
        System.out.println("hello spring boot");
        return "hello spring boot";
    }


}
