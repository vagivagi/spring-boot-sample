package com.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.dto.BaseUserDto;
import com.sample.repository.BaseUserMapper;
import com.sample.service.BaseUserService;

@Service("baseUserService")
@Transactional
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired
    private BaseUserMapper baseUserMapper;

    @Override
    public BaseUserDto findById(String id) {
        return baseUserMapper.findById(id);
    }

    @Override
    public List<BaseUserDto> findAll() {
        return baseUserMapper.findAll();
    }

    @Override
    public void create(BaseUserDto baseUserDto) {
        baseUserMapper.insert(baseUserDto);
    }

    @Override
    public void update(BaseUserDto baseUserDto) {
        baseUserMapper.update(baseUserDto);
    }

    @Override
    public void delete(String id) {
        baseUserMapper.delete(id);
    }


}
