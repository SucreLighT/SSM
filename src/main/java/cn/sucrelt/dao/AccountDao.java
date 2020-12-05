package cn.sucrelt.dao;

import cn.sucrelt.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

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
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户信息
     *
     * @param account
     */
    @Insert("insert into account (name, money) values (#{name}, #{money})")
    public void saveAccount(Account account);

}
