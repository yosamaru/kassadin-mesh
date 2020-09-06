package com.yosamaru.kassadin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestOneController {
    @RequestMapping("/1")
    @ResponseBody
    public String test01(){
        return "test01";
    }
}
