package com.demo.sender;

import com.demo.config.RabbitConst;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuwei
 * @date 2018/5/8 10:43
 */
@Configuration
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendNews() {
        String msg = "hi, i am China news";
        rabbitTemplate.convertAndSend(RabbitConst.EXCHANGE_NAME, RabbitConst.ROUTING_KEY_NEWS, msg);
    }

    public void sendWeather() {
        String msg = "hi, i am China weather";
        rabbitTemplate.convertAndSend(RabbitConst.EXCHANGE_NAME, RabbitConst.ROUTING_KEY_WEATHER, msg);
    }
}
