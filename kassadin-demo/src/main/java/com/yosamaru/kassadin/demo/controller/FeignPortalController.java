package com.yosamaru.kassadin.demo.controller;

import com.yosamaru.kassadin.common.api.CommonResult;
import com.yosamaru.kassadin.demo.service.FeignPortalService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Feign调用kassadin-portal接口示例
 * Created by macro on 2019/10/18.
 */
@Api(tags = "FeignPortalController", description = "Feign调用kassadin-portal接口示例")
@RestController
@RequestMapping("/feign/portal")
public class FeignPortalController {

    @Autowired
    private FeignPortalService portalService;

    @PostMapping("/login")
    public CommonResult login(@RequestParam String username, @RequestParam String password) {
        return portalService.login(username,password);
    }

    @GetMapping("/cartList")
    public CommonResult cartList() {
        return portalService.list();
    }
}