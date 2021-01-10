package com.yosamaru.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.cms.dao.MemberReportMapper;
import com.yosamaru.cms.pojo.entity.MemberReportDO;
import com.yosamaru.cms.service.MemberReportService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户举报表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class MemberReportServiceImpl extends ServiceImpl<MemberReportMapper, MemberReportDO> implements MemberReportService {

}
