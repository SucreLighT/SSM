package cn.sucrelt.controller;

import cn.sucrelt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户的表现层（控制器类）
 *
 * @author sucre
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll() {

        System.out.println("表现层：查询所有账户信息...");
        accountService.findAll();
        return "list";
    }
}
