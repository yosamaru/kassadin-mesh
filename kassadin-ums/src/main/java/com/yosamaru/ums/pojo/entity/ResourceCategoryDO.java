package com.yosamaru.ums.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 资源分类表
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("resource_category")
public class ResourceCategoryDO extends AbstractDO {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;


}
