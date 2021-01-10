package com.yosamaru.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.oms.dao.OrderMapper;
import com.yosamaru.oms.pojo.entity.OrderDO;
import com.yosamaru.oms.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderDO> implements OrderService {

}
