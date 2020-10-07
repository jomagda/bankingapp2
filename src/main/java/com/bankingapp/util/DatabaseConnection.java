package com.bankingapp.util;

import java.sql.Connection;

public abstract class DatabaseConnection {

	private String driver = "org.postgresql.Driver";
	
	private String databaseURL = "jdbc:postgresql://dbinstance.cbyo2e6eq9t4.us-east-1.rds.amazonaws.com:5432/portfolio";
	private String databaseUsername = "postgres";
	private String databasePassword = "root1234";
	/*
	 * private String databaseURL = System.getenv("portfoliodburl"); private String
	 * databaseUsername = System.getenv("portfoliodatabaseusername"); private String
	 * databasePassword = System.getenv("portfoliodatabasepassword");
	 */
	
	public static DatabaseConnection getInstance() {
        return new DatabaseConnectionImpl();
    }
    
    public abstract Connection getConnection();

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
