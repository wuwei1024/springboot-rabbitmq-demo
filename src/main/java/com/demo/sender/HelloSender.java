package com.demo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wuwei
 * @date 2018/5/7 15:55
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send() {
        String msg = "hello " + new Date();
        rabbitTemplate.convertAndSend("hello", msg);
        return msg;
    }
}
