package com.sample.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

import com.sample.dto.BaseUserAccountDto;
import com.sample.service.BaseUserAccountService;

@Component
public class AuthenticationEventListeners {

    @Autowired
    private BaseUserAccountService baseUserAccountService;

    @EventListener
    public void handleBadCredentials(AuthenticationFailureBadCredentialsEvent event) {
        String id = event.getAuthentication().getName();
        BaseUserAccountDto accountDto = baseUserAccountService.findById(id);

        int loginFailedCount = accountDto.getLoginFailedCount() + 1;
        accountDto.setLoginFailedCount(loginFailedCount);
        baseUserAccountService.update(accountDto);
    }
}
