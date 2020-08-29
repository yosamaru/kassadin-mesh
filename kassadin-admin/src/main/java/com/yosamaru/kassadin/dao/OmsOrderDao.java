package com.yosamaru.kassadin.dao;

import com.yosamaru.kassadin.dto.OmsOrderDeliveryParam;
import com.yosamaru.kassadin.dto.OmsOrderDetail;
import com.yosamaru.kassadin.dto.OmsOrderQueryParam;
import com.yosamaru.kassadin.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单自定义查询Dao
 * Created by macro on 2018/10/12.
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
