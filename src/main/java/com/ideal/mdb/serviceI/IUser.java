package com.ideal.mdb.serviceI;

import java.util.List;

import com.ideal.mdb.bean.User;

public interface IUser {
	/**
	 * 用户登陆
	 * @param user
	 * @return
	 */
	public String login(User user);
	/**
	 * 用户列表
	 * @param user
	 * @param startPage
	 * @param pageSize
	 * @return
	 */
	public List<User> queryUserList(User user, int startPage, int pageSize);
	
}
