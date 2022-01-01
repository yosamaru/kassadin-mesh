package com.yosamaru.cms;

import com.yosamaru.cms.pojo.entity.SubjectDO;
import com.yosamaru.cms.service.SubjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KassadinCmsApplicationTests {

    @Autowired
    private SubjectService subjectService;

    @Test
    void test01() {
        SubjectDO subjectDO = subjectService.getById(2);
        subjectDO.setProductCount(2);
        subjectService.updateById(subjectDO);
    }

}
