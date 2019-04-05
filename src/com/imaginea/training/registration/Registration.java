package com.imaginea.training.registration;

import com.imaginea.training.authentication.Authentication;
import com.imaginea.training.sampleapp.PersonalInfo;
import com.imaginea.training.userdata.UserRepository;

public class Registration
{
	private PersonalInfo personalInfo;
	private String password;
	Authentication auth=new Authentication();
	
	public boolean Register(PersonalInfo info,final String password)
	{
		
		if(false==auth.isValidEmail(info.getEmail()))
		{
			return false;
		}
		UserRepository repository=UserRepository.instance();
		auth.addDetails(info.getUsername(), password);
		repository.AddUser(info);
		return true;
	}

	public String login(String email, final String password) {
		return auth.login(email, password);
	}
	
}