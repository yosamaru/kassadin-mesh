package com.yosamaru.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.cms.dao.TopicMapper;
import com.yosamaru.cms.pojo.entity.TopicDO;
import com.yosamaru.cms.service.TopicService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 话题表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper, TopicDO> implements TopicService {

}
