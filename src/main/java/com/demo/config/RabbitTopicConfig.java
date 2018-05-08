package com.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuwei
 * @date 2018/5/8 10:10
 */
@Configuration
public class RabbitTopicConfig {

    //创建队列
    @Bean
    public Queue all() {
        return new Queue(RabbitConst.QUEUE_NAME_ALL);
    }

    @Bean
    public Queue news() {
        return new Queue(RabbitConst.QUEUE_NAME_NEWS);
    }

    @Bean
    public Queue weather() {
        return new Queue(RabbitConst.QUEUE_NAME_WEATHER);
    }

    //创建交换器
    @Bean
    TopicExchange exchange() {
        return new TopicExchange(RabbitConst.EXCHANGE_NAME);
    }

    //对列绑定交换器，并关联到ROUTING_KEY
    @Bean
    Binding bindingExchangeNews(Queue news, TopicExchange exchange) {
        return BindingBuilder.bind(news).to(exchange).with(RabbitConst.ROUTING_KEY_NEWS);
    }

    @Bean
    Binding bindingExchangeWeather(Queue weather, TopicExchange exchange) {
        return BindingBuilder.bind(weather).to(exchange).with(RabbitConst.ROUTING_KEY_WEATHER);
    }

    @Bean
    Binding bindingExchangeAll(Queue all, TopicExchange exchange) {
        return BindingBuilder.bind(all).to(exchange).with(RabbitConst.ROUTING_KEY_ALL);
    }
}
