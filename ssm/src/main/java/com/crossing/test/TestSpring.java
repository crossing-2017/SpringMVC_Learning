package com.crossing.test;

import com.crossing.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test01(){
        //// 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.findAll();
    }
}
