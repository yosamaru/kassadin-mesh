package com.yosamaru.ums.service.impl;

import com.yosamaru.ums.pojo.entity.MemberDO;
import com.yosamaru.ums.dao.MemberMapper;
import com.yosamaru.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, MemberDO> implements MemberService {

}
