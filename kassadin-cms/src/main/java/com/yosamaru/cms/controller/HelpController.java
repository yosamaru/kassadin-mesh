package com.yosamaru.cms.controller;


import com.yosamaru.cms.pojo.query.HelpInfoQuery;
import com.yosamaru.cms.service.HelpService;
import com.yosamaru.cms.validate.SearchCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.groups.Default;

/**
 * <p>
 * 帮助表 前端控制器
 * </p>
 *
 * @author Richard
 * @since 2020-12-12
 */
@RestController
@RequestMapping("/help-do")
@Validated
public class HelpController {
    @Autowired
    private HelpService helpService;

    @PostMapping("find-help-info")
    public void findHelpInfo(@Validated  final HelpInfoQuery helpInfoQuery) {
        helpService.findHelpInfo(helpInfoQuery);
    }

    @PostMapping("find-help-all-info")
    public void findHelpAllInfo(@Validated({Default.class, SearchCategory.class})  final HelpInfoQuery helpInfoQuery) {
        helpService.findHelpInfo(helpInfoQuery);
    }
}
