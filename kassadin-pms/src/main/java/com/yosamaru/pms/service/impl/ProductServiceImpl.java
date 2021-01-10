package com.yosamaru.pms.service.impl;

import com.yosamaru.pms.pojo.entity.ProductDO;
import com.yosamaru.pms.dao.ProductMapper;
import com.yosamaru.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, ProductDO> implements ProductService {

}
