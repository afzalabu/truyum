package com.cognizant.truyum.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandler {

	public static Connection getConnection() {
		
		Connection conn = null;
		FileInputStream fileInputStream = null;
		Properties property = new Properties();
		
		try {
			fileInputStream = new FileInputStream("connection.properties");
			property.load(fileInputStream);

			String driverName = property.getProperty("driver");
			String url = property.getProperty("connection-url");
			String username = property.getProperty("user");
			String password = property.getProperty("password");
			
			Class.forName(driverName);
			
			conn = DriverManager.getConnection(url, username, password);
			
			
		} catch (FileNotFoundException e) {
			conn = null;
		} catch (IOException e) {
			conn = null;
		} catch (SQLException e) {
			conn = null;
		} catch (ClassNotFoundException e) {
			conn = null;
		}
		
		return conn;
		
	}
	
}
