package com.lxt.idei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ydf")
public class HelloController {

        @RequestMapping("/hello")
        public String hello(){
            return "hello spring boot!";
        }
}
