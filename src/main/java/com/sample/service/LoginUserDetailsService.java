package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sample.dto.BaseUserDto;
import com.sample.repository.BaseUserMapper;

@Service
public class LoginUserDetailsService implements UserDetailsService {
    @Autowired
    BaseUserMapper baseUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        BaseUserDto baseUserDto = baseUserMapper.findById(username);
        if (baseUserDto == null){
            throw new UsernameNotFoundException("IDが見つかりませんでした。");
        }
        return new LoginUserDetails(baseUserDto);
    }

}
