package com.nagarro.libraryclients.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.libraryclients.services.DeleteServices;

@Controller
public class Delete {
	
	DeleteServices deleteservice = new DeleteServices();
	@RequestMapping("/delete/{bookcode}")
	public ModelAndView  delete(@PathVariable("bookcode") int bookscode) {

	ModelAndView mv = new ModelAndView();
	deleteservice.deletingbooks(bookscode);
	mv.setViewName("ViewLibrary");
	
	
	return new ModelAndView("redirect:/ViewLibrary.jsp");
	

}
}
