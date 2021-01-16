package com.yosamaru.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.oms.client.OrderBasicInfoClient;
import com.yosamaru.oms.config.OmsMessageConsume;
import com.yosamaru.oms.dao.CartItemMapper;
import com.yosamaru.oms.pojo.entity.CartItemDO;
import com.yosamaru.oms.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItemDO> implements CartItemService {

    @Autowired
    private OrderBasicInfoClient orderBasicInfoClient;

    @Autowired
    private OmsMessageConsume omsMessageConsume;

    // fegin
    public List<String> getOrderBasicInfo() {
        return orderBasicInfoClient.getAllOrderItem();
    }

    // rocketmq
    @Override
    public String getHelpAllCategory() {
        return null;
    }
}
