package com.yosamaru.admin.config;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class VerificationCodeAuthenticationToken extends UsernamePasswordAuthenticationToken {

    public VerificationCodeAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public VerificationCodeAuthenticationToken(Object principal, Collection<? extends GrantedAuthority> authorities) {
        super(principal, null, authorities);
    }

}
