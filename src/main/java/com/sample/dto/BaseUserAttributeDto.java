package com.sample.dto;

import org.springframework.security.core.GrantedAuthority;

import com.sample.dto.entity.BaseUserAttribute;

public class BaseUserAttributeDto extends BaseUserAttribute implements GrantedAuthority {

    @Override
    public String getAuthority() {
        return this.getAttributeName();
    }

}
