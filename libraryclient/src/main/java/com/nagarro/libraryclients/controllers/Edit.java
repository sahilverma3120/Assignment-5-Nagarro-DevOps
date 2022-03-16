package com.nagarro.libraryclients.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.libraryclients.entity.BooksEntity;
import com.nagarro.libraryclients.services.EditServices;




@Controller
public class Edit{
	EditServices editservice = new EditServices();
	@RequestMapping("/edit")
	public ModelAndView  edit(@RequestParam("bcode") int bookscode , @RequestParam("bname") String booksname,@RequestParam("select") String authors,@RequestParam("date") String adddates) {
	BooksEntity booksentity = new BooksEntity();
	booksentity.setBookCode(bookscode);
	booksentity.setBookName(booksname);
	booksentity.setAuthor(authors);
	booksentity.setAddDate(adddates);
	
	ModelAndView mv = new ModelAndView();
	

	editservice.updatingbooks(booksentity);
//	ViewLibraryController viewlib = new ViewLibraryController();
//	viewlib.getData();
	
	mv.setViewName("ViewLibrary");
	
	
	return mv;
	

}
}