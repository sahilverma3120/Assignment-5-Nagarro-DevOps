package com.nagarro.libraryclients.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.libraryclients.services.LoginService;
import com.nagarro.libraryclients.services.ViewLibraryService;

@Controller
public class Login 
{
	
	LoginService loginservice = new LoginService();

	@RequestMapping("/login")
	public ModelAndView getLogin(@RequestParam("uid") String userid, @RequestParam("password") String password) 
	{
		ModelAndView mv = new ModelAndView();
		
		if(this.loginservice.authenticate(userid, password) !=false)
		{
			mv.setViewName("ViewLibrary");
			mv.addObject("uid",userid);
			return mv;
		}
		else
		{
			mv.setViewName("Error");
			return mv;
		}
	}

}
