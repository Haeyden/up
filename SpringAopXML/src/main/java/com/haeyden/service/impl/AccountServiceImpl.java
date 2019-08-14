package com.haeyden.service.impl;

import com.haeyden.service.AccountService;

public class AccountServiceImpl implements AccountService {
    @Override
    public void saveAccount() {
        System.out.println("保存账户");

    }

    @Override
    public void updateAccount() {
        System.out.println("更新账户");
    }

    @Override
    public void deleteAccount() {
        System.out.println("删除账户");
    }
}
