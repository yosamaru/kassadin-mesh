package com.yosamaru.pms.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品审核记录
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("product_vertify_record")
public class ProductVertifyRecordDO extends AbstractDO {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long productId;

    private LocalDateTime createTime;

    /**
     * 审核人
     */
    private String vertifyMan;

    private Integer status;

    /**
     * 反馈详情
     */
    private String detail;


}
