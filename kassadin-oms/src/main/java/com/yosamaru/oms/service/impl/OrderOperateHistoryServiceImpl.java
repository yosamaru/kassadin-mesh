package com.yosamaru.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.oms.dao.OrderOperateHistoryMapper;
import com.yosamaru.oms.pojo.entity.OrderOperateHistoryDO;
import com.yosamaru.oms.service.OrderOperateHistoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistoryDO> implements OrderOperateHistoryService {

}
