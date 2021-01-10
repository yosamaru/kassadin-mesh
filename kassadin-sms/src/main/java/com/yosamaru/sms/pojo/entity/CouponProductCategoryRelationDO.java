package com.yosamaru.sms.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 优惠券和产品分类关系表
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("coupon_product_category_relation")
public class CouponProductCategoryRelationDO extends AbstractDO {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long couponId;

    private Long productCategoryId;

    /**
     * 产品分类名称
     */
    private String productCategoryName;

    /**
     * 父分类名称
     */
    private String parentCategoryName;


}
