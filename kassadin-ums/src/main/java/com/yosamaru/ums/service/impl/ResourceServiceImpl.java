package com.yosamaru.ums.service.impl;

import com.yosamaru.ums.pojo.entity.ResourceDO;
import com.yosamaru.ums.dao.ResourceMapper;
import com.yosamaru.ums.service.ResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台资源表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, ResourceDO> implements ResourceService {

}
