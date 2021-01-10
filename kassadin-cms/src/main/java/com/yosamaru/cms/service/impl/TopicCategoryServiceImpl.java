package com.yosamaru.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.cms.dao.TopicCategoryMapper;
import com.yosamaru.cms.pojo.entity.TopicCategoryDO;
import com.yosamaru.cms.service.TopicCategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 话题分类表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class TopicCategoryServiceImpl extends ServiceImpl<TopicCategoryMapper, TopicCategoryDO> implements TopicCategoryService {

}
