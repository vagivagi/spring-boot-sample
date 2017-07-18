package com.sample.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.sample.dto.BaseUserDto;

import lombok.Data;

@Data
public class LoginUserDetails implements UserDetails {
    private final BaseUserDto baseUserDto;

    public LoginUserDetails(BaseUserDto baseUserDto) {
        this.baseUserDto = baseUserDto;
    }

    public BaseUserDto getBaseUserDto() {
        return baseUserDto;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return baseUserDto.getBaseUserAttributeDtos();
    }

    @Override
    public String getPassword() {
        return baseUserDto.getBaseUserAccountDto().getPassword();
    }

    @Override
    public String getUsername() {
        return baseUserDto.getId();
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
