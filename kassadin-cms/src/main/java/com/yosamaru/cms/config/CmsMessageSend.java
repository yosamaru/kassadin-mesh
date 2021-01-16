package com.yosamaru.cms.config;

import com.kassadin.common.message.bo.GenericMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CmsMessageSend {
    @Autowired
    private CmsOutputSource cmsOutputSource;

    public boolean sendAfterSales(final GenericMessage message) {
        log.info("[sendAfterSales][开始发送消息, message = {}]", message.toString());

        Message<? extends GenericMessage> afterSalesMessageBoMessage = MessageBuilder.withPayload(message)
                .build();
        return cmsOutputSource.salesServiceOutput().send(afterSalesMessageBoMessage);
    }

    public boolean sendOrderInfo(final GenericMessage message) {
        Message<? extends GenericMessage> afterSalesMessageBoMessage = MessageBuilder.withPayload(message)
                .build();
        return cmsOutputSource.orderInfoOutput().send(afterSalesMessageBoMessage);
    }


    /**
     * 发送延迟消息
     *
     * @param message
     * @return
     */
    public boolean sendDelay(final GenericMessage message) {
        log.info("[sendDelay][开始发送消息完成, 消息 = {}]", message.toString());

        Message<? extends GenericMessage> delayMessage = MessageBuilder.withPayload(message)
                .setHeader(MessageConst.PROPERTY_DELAY_TIME_LEVEL, "3") // 设置延迟级别为 3，10 秒后消费。
                .build();
        // 发送消息
        boolean sendResult = cmsOutputSource.salesServiceOutput().send(delayMessage);
        log.info("[sendDelay][发送消息完成, 结果 = {}]", sendResult);
        return sendResult;
    }

    /**
     * 发送带标签的消息
     *
     * @param message
     * @param messageTag
     * @return
     */
    public boolean sendTag(final GenericMessage message, final String messageTag) {
        // 创建 Spring Message 对象
        Message<? extends GenericMessage> tagMessage = MessageBuilder.withPayload(message)
                .setHeader(MessageConst.PROPERTY_TAGS, messageTag) // 设置 Tag
                .build();
        // 发送消息
        cmsOutputSource.salesServiceOutput().send(tagMessage);
        return true;
    }

}
