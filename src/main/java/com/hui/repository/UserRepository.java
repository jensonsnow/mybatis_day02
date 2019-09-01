package com.hui.repository;

import com.hui.entity.User;

public interface UserRepository {
	
	public int addUser(User user);
    public int deleteUser(Integer id);
    public int updateUser(User user);
    public User selectUserById(Integer id);

}
