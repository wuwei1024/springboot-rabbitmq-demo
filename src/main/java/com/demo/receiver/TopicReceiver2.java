package com.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author wuwei
 * @date 2018/5/8 10:52
 */
@Component
@RabbitListener(queues = "weather")
public class TopicReceiver2 {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Topic Weather Receiver: " + msg);
    }
}
