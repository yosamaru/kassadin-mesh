package com.yosamaru.cms.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * <p>
 * 话题表
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("topic")
public class TopicDO extends AbstractDO {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long categoryId;

    private String name;

    private LocalDateTime createTime;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    /**
     * 参与人数
     */
    private Integer attendCount;

    /**
     * 关注人数
     */
    private Integer attentionCount;

    private Integer readCount;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 参与方式
     */
    private String attendType;

    /**
     * 话题内容
     */
    private String content;


}
