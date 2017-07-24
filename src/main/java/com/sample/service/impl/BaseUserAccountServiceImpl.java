package com.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.dto.BaseUserAccountDto;
import com.sample.repository.BaseUserAccountMapper;
import com.sample.service.BaseUserAccountService;

@Service("baseUserAccountService")
@Transactional
public class BaseUserAccountServiceImpl implements BaseUserAccountService {

    @Autowired
    private BaseUserAccountMapper baseUserAccountMapper;

    @Override
    public BaseUserAccountDto findById(String accountId) {
        BaseUserAccountDto baseUserAccountDto = baseUserAccountMapper.findById(accountId);
        return baseUserAccountDto;
    }

    @Override
    public List<BaseUserAccountDto> findAll() {
        List<BaseUserAccountDto> baseUserAccountDtos = baseUserAccountMapper.findAll();
        return baseUserAccountDtos;
    }

    @Override
    public void create(BaseUserAccountDto baseUserAccountDto) {
        baseUserAccountMapper.insert(baseUserAccountDto);
    }

    @Override
    public void update(BaseUserAccountDto baseUserAccountDto) {
        baseUserAccountMapper.update(baseUserAccountDto);
    }

    @Override
    public void delete(String accountId) {
        baseUserAccountMapper.delete(accountId);
    }

}
