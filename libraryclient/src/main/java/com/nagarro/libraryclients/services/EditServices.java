package com.nagarro.libraryclients.services;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.nagarro.libraryclients.controllers.ViewLibraryController;
import com.nagarro.libraryclients.entity.BooksEntity;


@Service
public class EditServices {
	
private RestTemplate restTemplate = new RestTemplate();
	
    final String URI_Users = "http://localhost:8087/librarymanagement/v1/update/";
	
	
	public void updatingbooks(BooksEntity booksentity) {
		
		try{
			HttpEntity<BooksEntity> requestUpdate = new HttpEntity<>(booksentity);
			ResponseEntity<BooksEntity> book = restTemplate.exchange(URI_Users+booksentity.getBookCode(), HttpMethod.PUT, requestUpdate,
			BooksEntity.class);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		ViewLibraryController view = new ViewLibraryController();
		view.getData();
			

}
}
