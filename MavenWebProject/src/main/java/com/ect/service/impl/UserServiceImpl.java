package com.ect.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ect.dao.UserDaoI;
import com.ect.model.User;
import com.ect.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

//	  @Autowired
//	  private UserDaoI userDao;

	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");

	}
    public Serializable save(User user) {
    	return null;
      //   return userDao.save(user);
    }

}
