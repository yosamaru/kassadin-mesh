package com.yosamaru.cms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yosamaru.cms.pojo.entity.HelpDO;
import com.yosamaru.cms.pojo.query.HelpInfoQuery;
import com.yosamaru.cms.pojo.vo.HelpVO;

import java.util.List;

/**
 * <p>
 * 帮助表 服务类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
public interface HelpService extends IService<HelpDO> {

    List<HelpVO> findHelpInfo(final HelpInfoQuery helpInfoQuery);
}
