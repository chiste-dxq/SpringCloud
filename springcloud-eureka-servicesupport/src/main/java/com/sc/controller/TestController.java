package com.sc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author: daixq
 * @Date: 2021/4/6 14:02
 * @Description:
 **/
@RestController
@RequestMapping("/hello")
public class TestController {

    @GetMapping("/hello")
    public String world(String str){
        System.out.println("传入的值为：" + str);
        return "hello,传入的值为：" + str;
    }
}
