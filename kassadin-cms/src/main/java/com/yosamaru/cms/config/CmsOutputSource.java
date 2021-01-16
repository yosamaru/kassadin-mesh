package com.yosamaru.cms.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CmsOutputSource {
    @Output("sales-service-output")
    MessageChannel salesServiceOutput();

    @Output("order-info-output")
    MessageChannel orderInfoOutput();
}
