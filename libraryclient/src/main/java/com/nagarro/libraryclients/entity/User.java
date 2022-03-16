package com.nagarro.libraryclients.entity;

import java.io.Serializable;

public class User  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String userid;
	String password;


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserEntity [username=" + userid + ", password=" + password + "]";
	}

	public User(String username, String password) {
		super();
		this.userid = username;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}

	
	


