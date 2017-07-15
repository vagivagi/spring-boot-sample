package com.sample.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.sample.dto.BaseUserAccountDto;

import lombok.Data;

@Data
public class LoginUserDetails implements UserDetails {
    private final BaseUserAccountDto baseUserAccountDto;

    public LoginUserDetails(BaseUserAccountDto baseUserAccountDto) {
        this.baseUserAccountDto = baseUserAccountDto;
    }

    public BaseUserAccountDto getBaseUserAccountDto() {
        return baseUserAccountDto;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO 自動生成されたメソッド・スタブ
        return AuthorityUtils.createAuthorityList("ROLE_USER");
    }

    @Override
    public String getPassword() {
        // TODO 自動生成されたメソッド・スタブ
        return baseUserAccountDto.getPassword();
    }

    @Override
    public String getUsername() {
        // TODO 自動生成されたメソッド・スタブ
        return baseUserAccountDto.getId();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

}
