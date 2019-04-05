package com.imaginea.training.registration;

import com.imaginea.training.authentication.Authentication;
import com.imaginea.training.sampleapp.PersonalInfo;
import com.imaginea.training.userdata.UserRepository;

public class Registration
{
	private PersonalInfo personalInfo;
	private String password;
	
	public boolean Register(PersonalInfo info,final String password)
	{
		Authentication auth=new Authentication();
		if(false==auth.isValidEmail(info.getEmail()))
		{
			return false;
		}
		UserRepository repository=UserRepository.instance();
		auth.addDetails(info.getUsername(), password);
		repository.AddUser(info);
		return true;
	}
	
}