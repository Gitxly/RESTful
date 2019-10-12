package com.zhiyou100.mapper;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.User;

public interface UserMapper {

	List<User> findAll(Map<String, Object> map);

	int addUser(User user);

	void deleteUserById(int id);

	User findUserById(int id);

	void updateUser(User user);

}
