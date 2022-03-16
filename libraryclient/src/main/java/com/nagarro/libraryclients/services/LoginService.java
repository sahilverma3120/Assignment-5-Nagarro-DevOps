package com.nagarro.libraryclients.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nagarro.libraryclients.entity.User;

@Service
public class LoginService {
	
private RestTemplate restTemplate = new RestTemplate();
	
    final String URI_Users = "http://localhost:8087/librarymanagement/v1/users/";
	
    public boolean authenticate(String userid, String password)  {
		Map<String,String> map= new HashMap<String,String>();
		
		List<User> userEntity =new ArrayList<>();
		try {
			 userEntity = restTemplate.getForObject(URI_Users+ userid, List.class);
		}
		catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		for(int i=0;i<1;i++) {
        	 map=(Map<String, String>) userEntity.get(i);
	 	}
		
        if(userid.equals(map.get("userid")) && password.equals(map.get("password"))) {
        	return true;
        }
        else {
        	return false;
        }
	}

}
