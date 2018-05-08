package com.demo.config;

/**
 * @author wuwei
 * @date 2018/5/8 14:46
 */
public class RabbitConst {
    //队列名称
    public static final String QUEUE_NAME_NEWS = "news";
    public static final String QUEUE_NAME_WEATHER = "weather";
    public static final String QUEUE_NAME_ALL = "all";
    //交换器名称
    public static final String EXCHANGE_NAME = "exchange";
    //路由键名称
    public static final String ROUTING_KEY_NEWS = "China.news";
    public static final String ROUTING_KEY_WEATHER = "China.weather";
    public static final String ROUTING_KEY_ALL = "China.#";//*表示一个词, #表示零个或多个词
}
