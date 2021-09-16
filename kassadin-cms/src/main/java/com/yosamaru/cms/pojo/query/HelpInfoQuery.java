package com.yosamaru.cms.pojo.query;

import com.yosamaru.cms.validate.SearchCategory;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class HelpInfoQuery {
    @NotNull(groups = SearchCategory.class, message = "帮助类别编号不能为空！")
    private String categoryId;

    @NotEmpty
    private String title;
    @NotEmpty
    private String showStatus;
}
