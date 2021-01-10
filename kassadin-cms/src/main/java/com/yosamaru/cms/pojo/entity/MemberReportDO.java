package com.yosamaru.cms.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * <p>
 * 用户举报表
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("member_report")
public class MemberReportDO extends AbstractDO {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 举报类型：0->商品评价；1->话题内容；2->用户评论
     */
    private Integer reportType;

    /**
     * 举报人
     */
    private String reportMemberName;

    private LocalDateTime createTime;

    private String reportObject;

    /**
     * 举报状态：0->未处理；1->已处理
     */
    private Integer reportStatus;

    /**
     * 处理结果：0->无效；1->有效；2->恶意
     */
    private Integer handleStatus;

    private String note;


}
