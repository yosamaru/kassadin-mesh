package com.yosamaru.sms.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalTime;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 限时购场次表
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("flash_promotion_session")
public class FlashPromotionSessionDO extends AbstractDO {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 场次名称
     */
    private String name;

    /**
     * 每日开始时间
     */
    private LocalTime startTime;

    /**
     * 每日结束时间
     */
    private LocalTime endTime;

    /**
     * 启用状态：0->不启用；1->启用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
