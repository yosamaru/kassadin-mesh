package com.yosamaru.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.oms.dao.OrderSettingMapper;
import com.yosamaru.oms.pojo.entity.OrderSettingDO;
import com.yosamaru.oms.service.OrderSettingService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单设置表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSettingDO> implements OrderSettingService {

}
