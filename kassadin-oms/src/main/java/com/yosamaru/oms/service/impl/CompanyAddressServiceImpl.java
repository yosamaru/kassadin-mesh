package com.yosamaru.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.oms.dao.CompanyAddressMapper;
import com.yosamaru.oms.pojo.entity.CompanyAddressDO;
import com.yosamaru.oms.service.CompanyAddressService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司收发货地址表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class CompanyAddressServiceImpl extends ServiceImpl<CompanyAddressMapper, CompanyAddressDO> implements CompanyAddressService {

}
