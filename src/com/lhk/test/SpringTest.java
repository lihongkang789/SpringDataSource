package com.lhk.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lhk.domain.User;
import com.lhk.service.UserService;
public class SpringTest {
	@Autowired
	private UserService userservice;
	@Test
	public void profiletest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		userservice=(UserService) ac.getBean("UserService");
		User user=new User();
		user.setId(11);
		user.setAge(23);
		user.setName("aaa");
		user.setAddress("aaa");
		user.setPhone("3223");
		userservice.Save(user);
		List<User> list=userservice.FindAll();
		for(Object o:list){
			System.out.println(o);
		}
	}
}
