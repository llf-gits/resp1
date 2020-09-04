package com.bianyi.service.impl;

import com.bianyi.dao.Account;
import com.bianyi.dao.AccountDao;
import com.bianyi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }
}
