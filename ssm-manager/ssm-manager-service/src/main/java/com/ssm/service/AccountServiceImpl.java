package com.ssm.service;

import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public void checkLogin() {
        System.out.println("登录验证");
    }
}
