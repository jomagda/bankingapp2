package com.bankingapp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bankingapp.service.CustomerService;

public class RequestHelper{

	public static Object processGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		System.out.println("helper");
		//boolean bool = new CustomerService().validateEmail("bogum@mail.com");
		//System.out.println("email available " + bool);
//		String u = System.getenv("portfoliodatabaseusername");
//		String p = System.getenv("portfoliodatabasepassword");
		String u = System.getProperty("portfoliodatabaseusername");
		String p = System.getProperty("portfoliodatabasepassword");
		String c = System.getenv("CATALINA_HOME");
		String r = "testing get db env variables: " + u + " " + p + " " + c;
		return r;
	}
	
	public static Object processPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		System.out.println("helper");
		boolean bool = new CustomerService().validateEmail("bogum@mail.com");
		System.out.println("email available " + bool);
		response.sendRedirect("../index.html");
		return "testing post";
	}

}
