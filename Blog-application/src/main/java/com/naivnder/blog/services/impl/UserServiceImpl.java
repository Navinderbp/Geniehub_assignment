package com.naivnder.blog.services.impl;

import java.util.List;import org.springframework.beans.factory.annotation.*;

import com.naivnder.blog.payloads.UserDto;
import com.naivnder.blog.services.UserService;
import com.naivnder.blog.repositories.*;
import com.naivnder.blog.entities.*;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user =this.dtoToUser(userDto);
		
		this.userRepo.save(user);
		User savedUser=this.userRepo.save(user);
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	private User dtoToUser(UserDto userDto) {
		User user=new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		return user;
		
	}
	public UserDto userToDto(User user) {
		UserDto userDto=new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getAbout());
		return userDto;
	}

}
