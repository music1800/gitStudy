package com.ect.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ect.service.UserServiceI;

public class SpringTest {

    @Test
    public void test(){
        //ͨ��spring.xml�����ļ�����Spring��Ӧ�ó��������Ļ���
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //��Spring��IOC�����л�ȡbean����
        UserServiceI userService = (UserServiceI) ac.getBean("userService");
        //ִ�в��Է���
        userService.test();
    }
}