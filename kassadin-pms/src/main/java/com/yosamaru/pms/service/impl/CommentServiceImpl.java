package com.yosamaru.pms.service.impl;

import com.yosamaru.pms.pojo.entity.CommentDO;
import com.yosamaru.pms.dao.CommentMapper;
import com.yosamaru.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, CommentDO> implements CommentService {

}
