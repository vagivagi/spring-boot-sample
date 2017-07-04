package com.sample.service;

import java.util.List;

import com.sample.dto.BaseUserDto;

public interface BaseUserService {

    public BaseUserDto findById(String id);

    public List<BaseUserDto> findAll();

    public void create(BaseUserDto baseUserDto);

    public void update(BaseUserDto baseUserDto);

    public void delete(String id);

}
