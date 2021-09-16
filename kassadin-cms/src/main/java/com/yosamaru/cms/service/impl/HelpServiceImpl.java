package com.yosamaru.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yosamaru.cms.dao.HelpMapper;
import com.yosamaru.cms.pojo.entity.HelpDO;
import com.yosamaru.cms.pojo.query.HelpInfoQuery;
import com.yosamaru.cms.pojo.vo.HelpVO;
import com.yosamaru.cms.service.HelpService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 帮助表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
public class HelpServiceImpl extends ServiceImpl<HelpMapper, HelpDO> implements HelpService {

    @Override
    public List<HelpVO> findHelpInfo(HelpInfoQuery helpInfoQuery) {
        return null;
    }
}
