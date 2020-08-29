package com.yosamaru.kassadin.auth.service;

import com.yosamaru.kassadin.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by macro on 2020/7/16.
 */
@FeignClient("kassadin-portal")
public interface UmsMemberService {
    @GetMapping("/sso/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
