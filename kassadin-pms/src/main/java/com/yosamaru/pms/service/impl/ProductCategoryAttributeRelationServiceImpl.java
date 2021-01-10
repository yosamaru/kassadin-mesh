package com.yosamaru.pms.service.impl;

import com.yosamaru.pms.pojo.entity.ProductCategoryAttributeRelationDO;
import com.yosamaru.pms.dao.ProductCategoryAttributeRelationMapper;
import com.yosamaru.pms.service.ProductCategoryAttributeRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationMapper, ProductCategoryAttributeRelationDO> implements ProductCategoryAttributeRelationService {

}
