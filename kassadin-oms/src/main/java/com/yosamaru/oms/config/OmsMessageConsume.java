package com.yosamaru.oms.config;

import com.kassadin.common.message.bo.AfterSalesMessageBo;
import com.kassadin.common.message.bo.GenericMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OmsMessageConsume {

    @StreamListener(OmsSinkSource.SALES_SERVICE_INPUT)
    public void onAfterSalesMessageReceived(@Payload AfterSalesMessageBo message) {
        log.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);

    }

    @StreamListener(OmsSinkSource.ORDER_INFO_INPUT)
    public void onOrderInfoMessageReceived(@Payload AfterSalesMessageBo message) {
        log.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);
    }
}
