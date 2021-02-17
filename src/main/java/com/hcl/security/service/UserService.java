package com.hcl.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hcl.security.model.User;
import com.hcl.security.repository.UserRepo;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException(String.format("Username (%s) was not found.", username));
		}
		return new UserDetailsImpl(user);
	}

}
