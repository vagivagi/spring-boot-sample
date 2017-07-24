package com.sample.service;

import java.util.List;

import com.sample.dto.BaseUserAccountDto;

public interface BaseUserAccountService {

    public BaseUserAccountDto findById(String accountId);

    public List<BaseUserAccountDto> findAll();

    public void create(BaseUserAccountDto baseUserAccountDto);

    public void update(BaseUserAccountDto baseUserAccountDto);

    public void delete(String accountId);

}
