package com.yosamaru.pms.service.impl;

import com.yosamaru.pms.pojo.entity.ProductAttributeDO;
import com.yosamaru.pms.dao.ProductAttributeMapper;
import com.yosamaru.pms.service.ProductAttributeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品属性参数表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeMapper, ProductAttributeDO> implements ProductAttributeService {

}
