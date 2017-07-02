package com.sample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sample.dto.BaseUserAccountDto;

@Mapper
public interface BaseUserAccountMapper {

    public BaseUserAccountDto findById(String id);

    public List<BaseUserAccountDto> findAll();

    public void update(BaseUserAccountDto baseUserAccountDto);

    public void insert(BaseUserAccountDto baseUserAccountDto);

    public void delete(BaseUserAccountDto baseUserAccountDto);
}
