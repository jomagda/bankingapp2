package com.bankingapp.web;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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
		String u1 = System.getenv("portfoliodatabaseusername");
		String p1 = System.getenv("portfoliodatabasepassword");
		String u = System.getProperty("portfoliodatabaseusername");
		String p = System.getProperty("portfoliodatabasepassword");
		String c = System.getenv("foo");
		String r1 = "testing get db env variables: " + u1 + " " + p1 + " " + c;
		String r = "testing get db env variables: " + u + " " + p + " " + c;
		
//		String filename = "/home/ec2-user/.jenkins/CredentialsFolder/credentials.txt";
//		Path path = Paths.get(filename);
//		byte[] bytes = Files.readAllBytes(path);
//		List<String> creds = Files.readAllLines(path, StandardCharsets.UTF_8);
		return System.getenv("testEnv");
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
