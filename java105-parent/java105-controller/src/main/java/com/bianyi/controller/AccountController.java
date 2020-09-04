package com.bianyi.controller;

import com.bianyi.dao.Account;
import com.bianyi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller  //@Controller +@ResponseBody
public class AccountController {

    @Autowired
    AccountService accountService;
    @RequestMapping("account/findAccount")
    public  Account findAccountById(@RequestParam("id") Integer id){
        System.out.println(accountService.findAccountById(id));
        return null;
    }
}
