/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethaserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DBUtills {
    
    private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/gocheeta";
	
	private static Connection connection;
	
	public static Connection getConnection() {
		
		try {
			
			// loading the driver
			Class.forName(DRIVERNAME);
			
			// getting the connection
			connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return connection;
	}
    
 
}
