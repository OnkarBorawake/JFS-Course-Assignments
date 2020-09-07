package com.manipal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.model.User;
import com.manipal.user.UserDao;

@Controller
public class WelcomeController {

	@RequestMapping(value="userform")
	public String getForm() {
		return "userform";
	}
	@RequestMapping(value ="/name", method = RequestMethod.GET)
		public ModelAndView greetWithName(@RequestParam String userName, @RequestParam String userPassword) {
		ModelAndView modelAndView = new ModelAndView("greeting-user"); //view name
		
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		UserDao userDao = new UserDao();
		Boolean b1 = userDao.verifyUser(user.getUserName(), user.getUserPassword());
		if(b1==false)
			return null;
		else
		{
			modelAndView.addObject("user", user); //model object name-value										
			return modelAndView;		
		}
			

	}}
//Boolean val = userDao.verifyUser(user.getUserName(),user.getUserPassword());
//
//if(val==false)
//{
//	return null;
//}
//else
//{
/*	@RequestMapping(value ="/name", method = RequestMethod.GET)
	public ModelAndView greetWithName(@RequestParam("userName") String name, @RequestParam("userLocation") String location) {
		ModelAndView modelAndView = new ModelAndView("greeting-name"); //view name
		modelAndView.addObject("uname" ,name); //model object: name & value format
		modelAndView.addObject("location", location);  //model object: name & value format
		return modelAndView;		//new ModelAndView(viewname, modelname, modelobject)
	}
	*/
	
//	@RequestMapping(value ="/name/{username}", method = RequestMethod.GET)
//	public ModelAndView greetWithName1(@PathVariable ("username") String name) {
//		ModelAndView modelAndView = new ModelAndView("greeting-name", "uname", name);
//		return modelAndView;
//	}

