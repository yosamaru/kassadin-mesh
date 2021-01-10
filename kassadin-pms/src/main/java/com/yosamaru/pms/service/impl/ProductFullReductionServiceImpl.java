package com.yosamaru.pms.service.impl;

import com.yosamaru.pms.pojo.entity.ProductFullReductionDO;
import com.yosamaru.pms.dao.ProductFullReductionMapper;
import com.yosamaru.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReductionDO> implements ProductFullReductionService {

}
