package com.manipal.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.UserDao;
import com.manipal.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value="userform")
	public String getForm() {
		return "userform";
	}
	
		
	@RequestMapping(value="/addUser", method=RequestMethod.POST)	
	public ModelAndView addUserDetails(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("useradded");
		Random rand = new Random();
		user.setUserId((int)rand.nextInt(999)+1001);
		userDao.addUser(user);		
		return modelAndView;
	}
	
	@RequestMapping(value="showUsers")
	public ModelAndView getUsers(){
		List<User> userList = userDao.getAllUsers();
		return new ModelAndView("userdetails", "userList", userList);
	}
	
	
}