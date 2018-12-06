package com.lhk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lhk.dao.UserDao;
import com.lhk.domain.User;
import com.lhk.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userdao;//通过spring 来配置

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void Save(User user) {
		System.out.println("保存用户");
		userdao.Save(user);
	}

	@Override
	public User FindById(int id) {
		System.out.println("查询成功");
		return userdao.FindById(id);
	}

	@Override
	public void Delete(int id) {
		System.out.println("删除成功");
		userdao.Delete(id);
		
	}

	@Override
	public void Update(User user) {
		System.out.println("更新成功");
		userdao.Update(user);
	}

	@Override
	public List<User> FindAll() {
		return userdao.FindAll();
	}

}
