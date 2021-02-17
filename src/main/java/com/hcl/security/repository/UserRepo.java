package com.hcl.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.hcl.security.model.User;

public interface UserRepo extends CrudRepository<User,Integer>{
	User findByUsername(String username);
}
