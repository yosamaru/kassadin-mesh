package com.yosamaru.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yosamaru.oms.pojo.entity.CartItemDO;

import java.util.List;

/**
 * <p>
 * 购物车表 服务类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
public interface CartItemService extends IService<CartItemDO> {
    List<String> getOrderBasicInfo();

    String getHelpAllCategory();
}
