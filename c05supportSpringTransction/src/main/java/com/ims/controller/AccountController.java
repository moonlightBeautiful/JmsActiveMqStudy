package com.ims.controller;

import javax.annotation.Resource;

import com.ims.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 账户controller层
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accoutService;

    @RequestMapping("/transfer")
    public String transferAccount() {
        try {
            accoutService.transferAccounts(1, 2, 200);
            return "OK";
        } catch (Exception e) {
            return "NO";
        }
    }
}
