package com.hcl.security.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.security.model.User;
import com.hcl.security.repository.UserRepo;

@Controller
public class LoginController {
 
	@Autowired
	UserRepo repo;
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("/create")
	public String addPage(ModelMap map) {
		User user = new User();
		map.addAttribute("user", user);
		return "create.jsp";
	}
	
	@PostMapping("/create")
	public String add(@Valid @ModelAttribute("user") User user, BindingResult result, ModelMap map) {
		if(result.hasErrors()) {
			return "create.jsp";
		}
		if(repo.findByUsername(user.getUsername()) != null) {
			map.addAttribute("error", "Username taken");
			return "create.jsp";
		}
		map.addAttribute("success", "Account successfully created");
		repo.save(user);
		return "login.jsp";
	}
    
	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout-complete")
	public String logout() {
		return "logout.jsp";
	}
 
}
