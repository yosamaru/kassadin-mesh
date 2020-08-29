package com.yosamaru.kassadin.auth.service;

import com.yosamaru.kassadin.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by macro on 2019/10/18.
 */
@FeignClient("kassadin-admin")
public interface UmsAdminService {

    @GetMapping("/admin/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
