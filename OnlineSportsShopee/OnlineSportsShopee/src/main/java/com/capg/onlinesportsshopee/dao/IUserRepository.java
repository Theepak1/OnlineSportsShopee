package com.capg.onlinesportsshopee.dao;

import com.capg.onlinesportsshopee.bean.User;

public interface IUserRepository {
	public User signIn(User user);
	public User signOut(User user);
	public User changePassword(long id, User user);
}
