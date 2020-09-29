package com.yosamaru.kassadin.portal.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * 取消订单消息的处理者
 * Created by macro on 2018/9/14.
 */
@Component
public class MessageSender {
    private static Logger LOGGER = LoggerFactory.getLogger(MessageSender.class);
    @Autowired
    private Source source;

    public <T> void send(T message) {
        source.output().send(MessageBuilder.withPayload(message).build());
    }
}
