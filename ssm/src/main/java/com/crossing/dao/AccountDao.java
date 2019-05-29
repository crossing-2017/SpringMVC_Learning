package com.crossing.dao;

import com.crossing.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层接口
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    public List<Account> finfAll();

    /**
     * 保存帐户信息
     * @param account
     */
    @Select("insert into account(name, money) values(#{name}, #{money})")
    public void saveAccount(Account account);
}
