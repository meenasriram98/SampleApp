package com.imaginea.training.sampleapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.imaginea.training.authentication.Authentication;
import com.imaginea.training.registration.Registration;
import com.imaginea.training.userdata.UserRepository;

public class SampleApp {
	Authentication object=new Authentication();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		//System.out.println(dateFormat.format(date));
		PersonalInfo person1=new PersonalInfo("meena@gmail","meena1","meena","sriram",Gender.FEMALE,date);
		
		Registration register=new Registration();
		UserRepository data=UserRepository.instance();
		register.Register(person1,"1234");
		System.out.println("total users"+data.totalUsers());
		
		String message=register.login("meena1","1234");
		
		System.out.println(message);
		
		

	}

}
