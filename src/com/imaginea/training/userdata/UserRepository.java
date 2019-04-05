package com.imaginea.training.userdata;

import java.util.ArrayList;
import java.util.List;

import com.imaginea.training.sampleapp.Person;
import com.imaginea.training.sampleapp.PersonalInfo;

public class UserRepository {
	
	 static UserRepository INSTANCE=new UserRepository();
	
	List<PersonalInfo> user=new ArrayList<>();
	
	
	
	private UserRepository() {
		
	}
	
	public static UserRepository instance() {
		return INSTANCE;
		
	}
	
	public void AddUser(PersonalInfo info)
	{
		user.add(info);
		System.out.println("new user added successfully");
	}
	
	public int totalUsers()
	{
		return user.size();
	}
	
	

}
