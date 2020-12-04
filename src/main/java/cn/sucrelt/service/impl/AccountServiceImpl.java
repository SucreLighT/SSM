package cn.sucrelt.service.impl;

import cn.sucrelt.domain.Account;
import cn.sucrelt.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户业务层接口实现类
 *
 * @author sucre
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户信息...");
    }
}
