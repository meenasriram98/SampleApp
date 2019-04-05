package com.imaginea.training.authentication;

import java.util.HashMap;
import java.util.Map;

public class Authentication {
Map<String,String> authDetails=new HashMap<>();

public boolean isValidEmail(final String email) {
	if(email==null)
	{
		return false;
	}
	if(null!=authDetails.get(email))
	{
		return false;
	}
	return true;
}

public void addDetails(String username,final String password)
{
	authDetails.put(username, password);
}

public boolean authenticate(String email,final String password)
{
	if(email==null)
	{
		return false;
	}
	if(authDetails.get(email)!=password)
	{
		return false;
	}
	return true;
}

public String login(String email,final String password)
{
	if(email==null||password==null)
	{
		return "invalid credentials";
	}
	if(authenticate(email,password)==true)
	{
		return "login successfull";
	}
	else
	{
		return "login failed";
	}
	
}

}
