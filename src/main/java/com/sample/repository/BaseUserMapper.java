package com.sample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sample.dto.BaseUserDto;

@Mapper
public interface BaseUserMapper {

    public BaseUserDto findById(String id);

    public List<BaseUserDto> findAll();

    public void update(BaseUserDto baseUserDto);

    public void insert(BaseUserDto baseUserDto);

    public void delete(String id);
}
