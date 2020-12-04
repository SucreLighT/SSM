package cn.sucrelt.dao;

import cn.sucrelt.domain.Account;

import java.util.List;

/**
 * 账户的持久层接口
 *
 * @author sucre
 */
public interface AccountDao {

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
