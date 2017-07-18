package com.sample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sample.dto.BaseUserAttributeDto;

@Mapper
public interface BaseUserAttributeMapper {

    public BaseUserAttributeDto findById(String attributeName, int sortNo, String id);

    public List<BaseUserAttributeDto> findAll();

    public void update(BaseUserAttributeDto baseUserAttributeDto);

    public void insert(BaseUserAttributeDto baseUserAttributeDto);

    public void delete(BaseUserAttributeDto baseUserAttributeDto);
}
