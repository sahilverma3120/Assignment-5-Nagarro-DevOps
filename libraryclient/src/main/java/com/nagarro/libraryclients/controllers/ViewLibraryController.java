package com.nagarro.libraryclients.controllers;

	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

import com.nagarro.libraryclients.entity.BooksEntity;
import com.nagarro.libraryclients.services.ViewLibraryService;
	
	public class ViewLibraryController {

		public static List<BooksEntity> bookslist ;
		@RequestMapping("/ViewLibrary")
		public ModelAndView getData() {
		
		ViewLibraryService view = new ViewLibraryService();
		 bookslist  = view.Data();
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("ViewLibrary");
		 mv.addObject("list",bookslist);
		 
		 return mv;
		}
	}



