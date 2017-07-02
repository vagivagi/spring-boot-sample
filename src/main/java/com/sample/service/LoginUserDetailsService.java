package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sample.dto.BaseUserAccountDto;
import com.sample.repository.BaseUserAccountMapper;

@Service
public class LoginUserDetailsService implements UserDetailsService {
    @Autowired
    BaseUserAccountMapper baseUserAccountMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        BaseUserAccountDto baseUserAccountDto = baseUserAccountMapper.findById(username);
        if (baseUserAccountDto == null){
            throw new UsernameNotFoundException("IDが見つかりませんでした。");
        }
        return new LoginUserDetails(baseUserAccountDto);
    }

}
