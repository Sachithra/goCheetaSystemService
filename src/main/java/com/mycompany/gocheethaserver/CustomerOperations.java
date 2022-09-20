/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethaserver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */


public class CustomerOperations {
    
    public Customer loginCutomer(String username,String password){
        
        final Connection connection = DBUtills.getConnection(); 
	String sql_query = "SELECT *FROM registercustomer where username=?"
         + " and password=?";
         Customer customer = null;
		 
try {
                      
			
          PreparedStatement stmt = connection.prepareStatement(sql_query);
			
		stmt.setString(1, username);
		stmt.setString(2, password);
			
			
		ResultSet rs = stmt.executeQuery();
			
		while(rs.next()) {
				
				
		customer = new Customer();
		customer.setUsername(username);
		customer.setPassword(password);
		customer.setValide(true);
				
		}
			
} catch(SQLException ex) {
			
			System.out.println(ex.getMessage());
		}
		
	return customer;
    }
        
    
    
    public boolean registerCustomer(Customer cutomer){
        
        Connection connection = DBUtills.getConnection(); 
     
     try{
          Statement stmt=connection.createStatement();
        
		
        int rows=stmt.executeUpdate(" INSERT INTO `registercustomer`(`id`,"
         + " `name`, `phone`, `username`, `password`) VALUES ('"+cutomer.getId()+"','"
         +cutomer.getName()+"','"+cutomer.getPhone()+"','"+cutomer.getUsername()+"','"
         +cutomer.getPassword()+"')");
      		
	 return rows>0;
	
    }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public BookingDetailss getvehicle(String type) {
        BookingDetailss bd = null;
                try {
            Connection connection = DBUtills.getConnection();
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT vehicles.type,"
                    + " drivers.name,drivers.branch FROM has JOIN vehicles ON "
                    + "has.vehicleId=vehicles.id JOIN drivers ON has.driverId"
                    + "=drivers.id WHERE type='" + type + "'");
            
            while(resultSet.next()) {
                bd = new BookingDetailss(resultSet.getString("name"), 
                        resultSet.getString("branch"), 
                        resultSet.getString("type"));
                
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }    
        return bd;
    }
    
     public boolean cuBookings(Placebookings place){
        
        Connection connection = DBUtills.getConnection(); 
     
     try{
          Statement stmt=connection.createStatement();
        
		
       int rows=stmt.executeUpdate(" INSERT INTO `booking`(`id`,"
         + " `pickup`, `droplocation`) VALUES ('"+place.getId()+"','" 
               +place.getPick()+"','"+place.getDrop()+"')");

      		
	 return rows>0;
	
    }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }

     
      public boolean feedBackes(Drivers driver){
        
        Connection connection = DBUtills.getConnection(); 
     
     try{
          Statement stmt=connection.createStatement();
        
		
       int rows=stmt.executeUpdate(" INSERT INTO `feedback`(`driver`,"
         + " `feedback`) VALUES ('"+driver.getName()+"','" 
               +driver.getFeedbacks()+"')");

      		
	 return rows>0;
	
    }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
 }
    
    
    
    
    
    
    

