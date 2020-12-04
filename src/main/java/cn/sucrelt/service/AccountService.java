package cn.sucrelt.service;

import cn.sucrelt.domain.Account;

import java.util.List;

/**
 * 账户的业务层层接口
 *
 * @author sucre
 */
public interface AccountService {

    /**
     * 查询所有账户
     *
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     *
     * @param account
     */
    public void saveAccount(Account account);

}
