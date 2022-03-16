package com.nagarro.libraryclients.services;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.nagarro.libraryclients.controllers.ViewLibraryController;
import com.nagarro.libraryclients.entity.BooksEntity;

public class AddServices {
	
private RestTemplate restTemplate = new RestTemplate();
	
    final String URI_Users = "http://localhost:8087/librarymanagement/v1/addbook/";

	public void addbooks(BooksEntity booksentity) {
		
	System.out.println(booksentity);
		
		try{
			HttpEntity<BooksEntity> requestUpdate = new HttpEntity<>(booksentity);
			ResponseEntity<BooksEntity> book = restTemplate.exchange(URI_Users+booksentity.getBookCode(),
					HttpMethod.POST, requestUpdate, BooksEntity.class);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		ViewLibraryController view = new ViewLibraryController();
		view.getData();

}
}
