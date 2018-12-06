package com.lhk.service;

import java.util.List;

import com.lhk.domain.User;

public interface UserService {
	/**
	 * 保存用户
	 * @param user
	 */
	void Save(User user);
	/**
	 * 通过Id查询用户
	 * @param id
	 * @return
	 */
	User FindById(int id);
	/**
	 * 删除用户
	 * @param id
	 */
	void Delete(int id);
	/**
	 * 更新用户
	 * @param user
	 */
	void Update(User user);
	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> FindAll();
}
