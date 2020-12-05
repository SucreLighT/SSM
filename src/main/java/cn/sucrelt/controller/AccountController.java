package cn.sucrelt.controller;

import cn.sucrelt.domain.Account;
import cn.sucrelt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    public String findAll(Model model) {

        System.out.println("表现层：查询所有账户信息...");
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }

        model.addAttribute("list", list);
        return "list";
    }
}
