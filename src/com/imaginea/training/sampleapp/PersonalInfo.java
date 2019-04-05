package com.imaginea.training.sampleapp;

import java.util.Date;

public class PersonalInfo {
	
	private String email;
	private String username;
	private String firstName;
	private String lastName;
	private Gender gender;
	private Date dateOfBirth;
	
	PersonalInfo(String email,String username,String firstName,String lastName,Gender gender,Date date)
	{
		this.email=email;
		this.username=username;
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.dateOfBirth=date;
		
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getUsername()
	{
		return username;
	}

}
