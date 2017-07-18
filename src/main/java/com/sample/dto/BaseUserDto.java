package com.sample.dto;

import java.util.List;

import com.sample.dto.entity.BaseUser;

public class BaseUserDto extends BaseUser {

    private BaseUserAccountDto baseUserAccountDto;

    private List<BaseUserAttributeDto> baseUserAttributeDtos;

    public BaseUserAccountDto getBaseUserAccountDto() {
        return baseUserAccountDto;
    }

    public void setBaseUserAccountDto(BaseUserAccountDto baseUserAccountDto) {
        this.baseUserAccountDto = baseUserAccountDto;
    }

    public List<BaseUserAttributeDto> getBaseUserAttributeDtos() {
        return baseUserAttributeDtos;
    }

    public void setBaseUserAttributeDtos(List<BaseUserAttributeDto> baseUserAttributeDtos) {
        this.baseUserAttributeDtos = baseUserAttributeDtos;
    }
}
