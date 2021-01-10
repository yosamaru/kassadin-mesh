package com.yosamaru.ums.service.impl;

import com.yosamaru.ums.pojo.entity.MemberProductCategoryRelationDO;
import com.yosamaru.ums.dao.MemberProductCategoryRelationMapper;
import com.yosamaru.ums.service.MemberProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class MemberProductCategoryRelationServiceImpl extends ServiceImpl<MemberProductCategoryRelationMapper, MemberProductCategoryRelationDO> implements MemberProductCategoryRelationService {

}
