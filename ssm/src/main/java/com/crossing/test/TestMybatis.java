package com.crossing.test;

import com.crossing.dao.AccountDao;
import com.crossing.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void test01() throws IOException {
        // 加载配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        AccountDao accountDao = session.getMapper(AccountDao.class);
        // 查询所有数据
        List<Account> accounts = accountDao.finfAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        // 关闭资源
        session.close();
        is.close();
    }

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void run2() throws Exception {
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(400d);

        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        // 保存
        dao.saveAccount(account);

        // 提交事务
        session.commit();

        // 关闭资源
        session.close();
        in.close();
    }
}
