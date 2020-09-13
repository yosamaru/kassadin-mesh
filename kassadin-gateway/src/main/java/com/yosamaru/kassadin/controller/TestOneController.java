package com.yosamaru.kassadin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/test")
public class TestOneController {
    @Value("${aaa:}")
    private String a1;

    @RequestMapping("/1")
    @ResponseBody
    public String test01() {
        return a1;
    }
}
