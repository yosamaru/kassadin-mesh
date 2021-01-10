package com.yosamaru.ums.service.impl;

import com.yosamaru.ums.pojo.entity.AccountDO;
import com.yosamaru.ums.dao.AccountMapper;
import com.yosamaru.ums.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountDO> implements AccountService {

}
