package com.nagarro.libraryclients.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.libraryclients.entity.BooksEntity;
import com.nagarro.libraryclients.services.AddServices;

@Controller
public class Add {
	
	AddServices addservice = new AddServices();
	@RequestMapping("/add")
	public ModelAndView  add(@RequestParam("bcode") int bookscode , @RequestParam("bname") String booksname,@RequestParam("select") String authors,@RequestParam("date") String adddates) {
	BooksEntity booksentity = new BooksEntity();

	booksentity.setBookCode(bookscode);
	booksentity.setBookName(booksname);
	booksentity.setAuthor(authors);
	booksentity.setAddDate(adddates);
	
	ModelAndView mv = new ModelAndView();
	
	addservice.addbooks(booksentity);
	mv.setViewName("ViewLibrary");
	return mv;
	}
}
