package com.haeyden.service.impl;

import com.haeyden.service.AccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public void save() {
        System.out.println("ACCOUNT_SERVICE RUNNING:  Account save...");
    }
}
