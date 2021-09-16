package com.yosamaru.cms.controller;


import com.google.common.collect.Lists;
import com.yosamaru.cms.service.HelpCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 帮助分类表 前端控制器
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Api
@RestController
@RequestMapping("/help-category-do")
public class HelpCategoryController {

    @Autowired
    private HelpCategoryService helpCategoryService;

    @ApiOperation(value = "获取订单信息", notes = "获取订单信息")
    @GetMapping(value = "get-all-order-item")
    public List<String> getOrderBasicInfo() {
        final List<String> orderInfo = Lists.newArrayList();
        orderInfo.add("1");
        orderInfo.add("2");
        orderInfo.add("3");
        orderInfo.add("4");
        return orderInfo;
    }

    @GetMapping(value = "get-help-all-category")
    public void getHelpAllCategory() {
        helpCategoryService.getHelpAllCategory();
    }
}
