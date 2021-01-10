package com.yosamaru.ums.service.impl;

import com.yosamaru.ums.pojo.entity.AccountLoginLogDO;
import com.yosamaru.ums.dao.AccountLoginLogMapper;
import com.yosamaru.ums.service.AccountLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class AccountLoginLogServiceImpl extends ServiceImpl<AccountLoginLogMapper, AccountLoginLogDO> implements AccountLoginLogService {

}
