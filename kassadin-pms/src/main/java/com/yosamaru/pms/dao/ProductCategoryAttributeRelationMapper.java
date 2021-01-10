package com.yosamaru.pms.dao;

import com.yosamaru.pms.pojo.entity.ProductCategoryAttributeRelationDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） Mapper 接口
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
public interface ProductCategoryAttributeRelationMapper extends BaseMapper<ProductCategoryAttributeRelationDO> {

}
