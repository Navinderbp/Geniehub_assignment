package com.naivnder.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naivnder.blog.entities.User;

public interface UserRepo  extends JpaRepository<User,Integer>{

}
