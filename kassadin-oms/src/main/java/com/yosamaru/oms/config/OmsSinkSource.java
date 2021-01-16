package com.yosamaru.oms.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface OmsSinkSource {

    final static String SALES_SERVICE_INPUT = "sales-service-input";

    final static String ORDER_INFO_INPUT = "order-info-input";

    @Input(SALES_SERVICE_INPUT)
    SubscribableChannel salesServiceInput();

    @Input(ORDER_INFO_INPUT)
    SubscribableChannel orderInfoInput();
}
