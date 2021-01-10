package com.yosamaru.oms.pojo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 购物车表
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("cart_item")
public class CartItemDO extends AbstractDO {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long productId;

    private Long productSkuId;

    private Long memberId;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 添加到购物车的价格
     */
    private BigDecimal price;

    /**
     * 商品主图
     */
    private String productPic;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品副标题（卖点）
     */
    private String productSubTitle;

    /**
     * 商品sku条码
     */
    private String productSkuCode;

    /**
     * 会员昵称
     */
    private String memberNickname;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    private LocalDateTime modifyDate;

    /**
     * 是否删除
     */
    private Integer deleteStatus;

    /**
     * 商品分类
     */
    private Long productCategoryId;

    private String productBrand;

    private String productSn;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    private String productAttr;


}
