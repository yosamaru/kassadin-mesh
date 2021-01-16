package com.yosamaru.oms.controller;


import com.yosamaru.oms.service.CartItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 购物车表 前端控制器
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Api("购物车信息")
@RestController
@RequestMapping("/cart-item-do")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @ApiOperation(value = "获取购物车产品", notes = "获取购物车产品")
    @GetMapping("get-cart-item")
    public List<String> getCartItem() {
        return cartItemService.getOrderBasicInfo();
    }

    @ApiOperation(value = "获取帮助问答分类", notes = "获取帮助问答分类")
    @GetMapping("get-help-all-category")
    public String getHelpAllCategory() {
        return cartItemService.getHelpAllCategory();
    }
}
