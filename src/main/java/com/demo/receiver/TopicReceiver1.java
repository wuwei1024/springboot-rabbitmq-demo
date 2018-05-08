package com.demo.receiver;

import com.demo.config.RabbitConst;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author wuwei
 * @date 2018/5/8 10:51
 */
@Component
@RabbitListener(queues = RabbitConst.QUEUE_NAME_NEWS)
public class TopicReceiver1 {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Topic News Receiver: " + msg);
    }
}
