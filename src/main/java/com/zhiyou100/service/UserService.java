package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.User;

public interface UserService {

	List<User> findAll(Map<String,Object> map);

	boolean addUser(User user);

	void deleteUserById(int id);

	User findUserById(int id);

	void updateUser(User user);

}
