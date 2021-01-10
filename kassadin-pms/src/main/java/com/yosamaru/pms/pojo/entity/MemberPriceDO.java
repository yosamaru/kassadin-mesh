package com.yosamaru.pms.pojo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品会员价格表
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("member_price")
public class MemberPriceDO extends AbstractDO {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long productId;

    private Long memberLevelId;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    private String memberLevelName;


}
