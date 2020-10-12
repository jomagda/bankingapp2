package com.bankingapp.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnectionImpl extends DatabaseConnection {

	@Override
	public Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			//Connection conn = 
			//		DriverManager.getConnection(getDatabaseURL(), getDatabaseUsername(), getDatabasePassword());
			List<String> creds = getCreds();
			Connection conn = 
					DriverManager.getConnection(creds.get(0), creds.get(1), creds.get(2));
			if(conn != null) {
				System.out.println("conn ok");
			}
			else {
				System.out.println("no conn");
			}
			return conn;
		} catch(ClassNotFoundException ex) {
			Logger.getLogger(DatabaseConnectionImpl.class.getName()).log(Level.SEVERE, null, ex);
		} catch(SQLException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

}
