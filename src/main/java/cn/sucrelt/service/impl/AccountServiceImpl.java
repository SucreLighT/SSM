package cn.sucrelt.service.impl;

import cn.sucrelt.dao.AccountDao;
import cn.sucrelt.domain.Account;
import cn.sucrelt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户业务层接口实现类
 *
 * @author sucre
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户信息...");
        accountDao.saveAccount(account);
    }
}
