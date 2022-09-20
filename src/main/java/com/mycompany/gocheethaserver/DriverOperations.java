/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethaserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DriverOperations {
     public Drivers loginDriver(String name,String phone){
        
        final Connection connection = DBUtills.getConnection(); 
	String sql_query = "SELECT *FROM drivers where name=?"
         + " and phone=?";
         Drivers driver = null;
		 
try {
                      
			
          PreparedStatement stmt = connection.prepareStatement(sql_query);
			
		stmt.setString(1, name);
		stmt.setString(2, phone);
			
			
		ResultSet rs = stmt.executeQuery();
			
		while(rs.next()) {
				
				
		driver = new Drivers();
		driver.setName(name);
		driver.setPhone(phone);
		driver.setIsValidate(true);
				
		}
			
} catch(SQLException ex) {
			
	System.out.println(ex.getMessage());
		}
		
	return driver;
    }
        
}
