package com.yosamaru.kassadin.mapper;

import com.yosamaru.kassadin.model.UmsIntegrationConsumeSetting;
import com.yosamaru.kassadin.model.UmsIntegrationConsumeSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsIntegrationConsumeSettingMapper {
    long countByExample(UmsIntegrationConsumeSettingExample example);

    int deleteByExample(UmsIntegrationConsumeSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationConsumeSetting record);

    int insertSelective(UmsIntegrationConsumeSetting record);

    List<UmsIntegrationConsumeSetting> selectByExample(UmsIntegrationConsumeSettingExample example);

    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsIntegrationConsumeSetting record, @Param("example") UmsIntegrationConsumeSettingExample example);

    int updateByExample(@Param("record") UmsIntegrationConsumeSetting record, @Param("example") UmsIntegrationConsumeSettingExample example);

    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);
}