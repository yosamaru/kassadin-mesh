package com.yosamaru.pms.service.impl;

import com.yosamaru.pms.pojo.entity.ProductLadderDO;
import com.yosamaru.pms.dao.ProductLadderMapper;
import com.yosamaru.pms.service.ProductLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadderDO> implements ProductLadderService {

}
