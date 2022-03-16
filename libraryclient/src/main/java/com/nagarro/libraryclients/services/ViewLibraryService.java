package com.nagarro.libraryclients.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.libraryclients.entity.BooksEntity;
import com.nagarro.libraryclients.entity.User;


@Service
public class ViewLibraryService {
	
	private RestTemplate restTemplate= new RestTemplate();
	
   final String URI_Books = "http://localhost:8087/librarymanagement/v1/books";
	
	    public List<BooksEntity> Data(){
	
	    	Map<String,String> map= new HashMap<String,String>();
	    	Map<String,Integer> mapt= new HashMap<String,Integer>();
			List<BooksEntity> booksentity = new ArrayList<>();
			List<User> userEntity =new ArrayList<>();
			try {
				 userEntity = restTemplate.getForObject(URI_Books, List.class);
			}catch(Exception ex) {
				System.err.println(ex.getMessage());
			}
			
			 
			 for(int i=0;i<userEntity.size();i++) {
	        	 map=(Map<String, String>) userEntity.get(i);
	        	 String author=map.get("author");
	        	 String bname=map.get("bookName");
	        	 String addate=map.get("addDate");
	        	 mapt = (Map<String, Integer>) userEntity.get(i);
	        	 
	        	 int bocode = mapt.get("bookcode");
	        	 BooksEntity bentity = new BooksEntity();
	        	 bentity.setBookName(bname);
	        	 bentity.setAuthor(author);
	        	 bentity.setAddDate(addate);
	        	 bentity.setBookCode(bocode);
	        	 booksentity.add(bentity);
		 	 
	         }
		return booksentity;
	}

}
