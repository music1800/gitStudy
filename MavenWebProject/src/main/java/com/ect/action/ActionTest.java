package com.ect.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.ect.service.UserServiceI;

@ParentPackage("basePackage")
@Action(value="struts2Test")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
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
	        System.out.println("进入TestAction");
	        userService.test();
	    }

}
