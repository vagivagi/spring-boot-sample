package com.sample.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.sample.dto.BaseUserAccountDto;

import lombok.Data;

@Data
public class LoginUserDetails extends User {
    private final BaseUserAccountDto baseUserAccountDto;

    public LoginUserDetails(BaseUserAccountDto baseUserAccountDto) {
        super(baseUserAccountDto.getId(), baseUserAccountDto.getPassword(),
                AuthorityUtils.createAuthorityList("ROLE_USER"));
        this.baseUserAccountDto = baseUserAccountDto;
    }

}
