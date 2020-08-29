package com.yosamaru.kassadin.dao;

import com.yosamaru.kassadin.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品属性Dao
 * Created by macro on 2018/5/23.
 */
public interface PmsProductAttributeDao {
    /**
     * 获取商品属性信息
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
