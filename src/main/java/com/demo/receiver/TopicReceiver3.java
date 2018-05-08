package com.demo.receiver;

import com.demo.config.RabbitConst;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author wuwei
 * @date 2018/5/8 10:53
 */
@Component
@RabbitListener(queues = RabbitConst.QUEUE_NAME_ALL)
public class TopicReceiver3 {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Topic All Receiver: " + msg);
    }
}
