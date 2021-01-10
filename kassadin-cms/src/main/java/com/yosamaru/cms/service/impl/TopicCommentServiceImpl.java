package com.yosamaru.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.cms.dao.TopicCommentMapper;
import com.yosamaru.cms.pojo.entity.TopicCommentDO;
import com.yosamaru.cms.service.TopicCommentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 专题评论表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class TopicCommentServiceImpl extends ServiceImpl<TopicCommentMapper, TopicCommentDO> implements TopicCommentService {

}
