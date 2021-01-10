package com.yosamaru.ums.service.impl;

import com.yosamaru.ums.pojo.entity.MenuDO;
import com.yosamaru.ums.dao.MenuMapper;
import com.yosamaru.ums.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台菜单表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuDO> implements MenuService {

}
