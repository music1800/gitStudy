package com.ect.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.ect.service.UserServiceI;

@ParentPackage("basePackage")
@Action(value="struts2Test")//ʹ��convention-plugin����ṩ��@Actionע�⽫һ����ͨjava���עΪһ�����Դ����û������Action��Action������Ϊstruts2Test
@Namespace("/")//ʹ��convention-plugin����ṩ��@Namespaceע��Ϊ���Actionָ��һ�������ռ�
public class ActionTest {
	 @Autowired
	 private UserServiceI userService;

	    /**
	     * http://localhost:8080/SSHE/strust2Test!test.action
	     * MethodName: test
	     * Description: 
	     * @author 
	     */
	    public void test(){
	        System.out.println("����TestAction");
	        userService.test();
	    }

}
