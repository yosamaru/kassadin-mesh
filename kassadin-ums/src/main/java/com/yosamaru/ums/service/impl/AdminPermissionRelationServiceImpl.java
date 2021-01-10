package com.yosamaru.ums.service.impl;

import com.yosamaru.ums.pojo.entity.AdminPermissionRelationDO;
import com.yosamaru.ums.dao.AdminPermissionRelationMapper;
import com.yosamaru.ums.service.AdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationMapper, AdminPermissionRelationDO> implements AdminPermissionRelationService {

}
