package com.naivnder.blog.services;

import java.util.List;

import com.naivnder.blog.payloads.UserDto;

public interface UserService {
	UserDto  createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleUser(Integer userId);
}
