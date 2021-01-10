package com.yosamaru.pms.service.impl;

import com.yosamaru.pms.pojo.entity.ProductAttributeValueDO;
import com.yosamaru.pms.dao.ProductAttributeValueMapper;
import com.yosamaru.pms.service.ProductAttributeValueService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValueDO> implements ProductAttributeValueService {

}
