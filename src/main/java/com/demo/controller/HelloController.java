package com.demo.controller;

import com.demo.sender.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuwei
 * @date 2018/5/7 16:23
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloSender helloSender;

    @RequestMapping("/send")
    public String send() {
        return helloSender.send();
    }
}
