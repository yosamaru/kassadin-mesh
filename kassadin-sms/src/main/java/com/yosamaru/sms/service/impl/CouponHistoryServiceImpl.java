package com.yosamaru.sms.service.impl;

import com.yosamaru.sms.pojo.entity.CouponHistoryDO;
import com.yosamaru.sms.dao.CouponHistoryMapper;
import com.yosamaru.sms.service.CouponHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠券使用、领取历史表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryMapper, CouponHistoryDO> implements CouponHistoryService {

}
