package com.bankingapp.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.List;

public abstract class DatabaseConnection {

	private String driver = "org.postgresql.Driver";
	private String databaseURL = System.getenv("portfoliodburl");
	private String databaseUsername = System.getenv("portfoliodatabaseusername");
	private String databasePassword = System.getenv("portfoliodatabasepassword");
	private String filename = "/home/ec2-user/CredentialsFolder/credentials.txt";
	private Path path = Paths.get(filename);
	private List<String> creds;
	
	public static DatabaseConnection getInstance() {
        return new DatabaseConnectionImpl();
    }
    
    public abstract Connection getConnection();
     
    public List<String> getCreds() throws IOException{
    	byte[] bytes = Files.readAllBytes(path);
    	creds = Files.readAllLines(path, StandardCharsets.UTF_8);
    	return creds;
    }

	public String getDriver() {
		return driver;
	}

	public String getDatabaseURL() {
		return databaseURL;
	}

	public String getDatabaseUsername() {
		return databaseUsername;
	}

	public String getDatabasePassword() {
		return databasePassword;
	}
    
    
}
