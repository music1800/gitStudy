package com.ect.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ect.model.User;
import com.ect.service.UserServiceI;

public class TestHibernate {
	private UserServiceI userService;
    @Before
    public void before(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
        userService = (UserServiceI) ac.getBean("userService");
    }
    
    @Test
    public void testSaveMethod(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
        //UserServiceI userService = (UserServiceI) ac.getBean("userService");
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setName("¹Â°Á²ÔÀÇ");
        user.setPwd("123");
        user.setCreatedatetime(new Date()); 
        userService.save(user);
    }

}
