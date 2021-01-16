package com.yosamaru.cms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kassadin.common.message.bo.AfterSalesMessageBo;
import com.kassadin.common.message.bo.GenericMessage;
import com.yosamaru.cms.config.CmsMessageSend;
import com.yosamaru.cms.dao.HelpCategoryMapper;
import com.yosamaru.cms.pojo.entity.HelpCategoryDO;
import com.yosamaru.cms.service.HelpCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * <p>
 * 帮助分类表 服务实现类
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@Service
@Slf4j
public class HelpCategoryServiceImpl extends ServiceImpl<HelpCategoryMapper, HelpCategoryDO> implements HelpCategoryService {
    @Autowired
    private HelpCategoryMapper helpCategoryMapper;

    @Autowired
    private CmsMessageSend cmsMessageSend;

    @Override
    public void getHelpAllCategory() {
        QueryWrapper<HelpCategoryDO> wrapper = new QueryWrapper();
        wrapper.like("name", "流程");
        final List<HelpCategoryDO> helpCategoryDOS = helpCategoryMapper.selectList(wrapper);

        log.info(helpCategoryDOS.toString());

        final GenericMessage message = AfterSalesMessageBo.builder().messageId(new Random().nextLong()).content("我要发送消息了").build();
        final boolean result = cmsMessageSend.sendAfterSales(message);
        log.info("getHelpAllCategory 发送消息结果：{}", result);
    }
}
