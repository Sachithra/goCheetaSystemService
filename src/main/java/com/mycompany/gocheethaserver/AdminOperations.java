/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethaserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebParam;


/**
 *
 * @author User
 */
public class AdminOperations {
    public Admin loginAdmin(String username,String password){
        
        final Connection connection = DBUtills.getConnection(); 
	String sql_query = "SELECT *FROM admin where username=?"
         + " and password=?";
         Admin admin = null;
		 
try {
                      
			
          PreparedStatement stmt = connection.prepareStatement(sql_query);
			
		stmt.setString(1, username);
		stmt.setString(2, password);
			
			
		ResultSet rs = stmt.executeQuery();
			
		while(rs.next()) {
				
				
		admin = new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		admin.setIsvalid(true);
				
		}
			
} catch(SQLException ex) {
			
	System.out.println(ex.getMessage());
	}
		
	return admin;
    }
    
   
    public boolean registeDriver(Drivers driver){
        
        Connection connection = DBUtills.getConnection(); 
     
     try{
          Statement stmt=connection.createStatement();
        
		
        int rows=stmt.executeUpdate(" INSERT INTO `drivers`(`id`,"
         + " `name`, `age`, `branch`, `phone`) VALUES ('"+driver.getId()+"','"
         +driver.getName()+"','"+driver.getAge()+"','"+driver.getBranch()+"','"
         +driver.getPhone()+"')");
      		
	 return rows>0;
	
    }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean addVehicle(Vehicle vehicle){
        
        Connection connection = DBUtills.getConnection(); 
     
     try{
          Statement stmt=connection.createStatement();
        
		
        int rows=stmt.executeUpdate(" INSERT INTO `vehicles`(`id`,"
         + " `vehicleno`, `type`) VALUES ('"+vehicle.getId()+"','"
         +vehicle.getVno()+"','"+vehicle.getType()+"')");
      		
	 return rows>0;
	
    }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }

    

    
    public boolean updateDriver(Drivers driver) {
        try {
            Connection connection = DBUtills.getConnection(); 
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `drivers` SET `name` = "
             + "'" + driver.getName() + "', `age` = '" 
            + driver.getAge() +  "', `branch` = '" + driver.getBranch() + "',"
            + " `phone` = '" + driver.getPhone()+"' WHERE (`id` = '"  + 
            driver.getId() + "')");
            
            return rows > 0;
            
        } catch (SQLException e) {
            System.out.println(e);
        }  
         return false;
    }
    
    public boolean updateVehicle(Vehicle vehicle) {
        try {
            Connection connection = DBUtills.getConnection(); 
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `vehicles` SET `vehicleno` = "
             + "'" + vehicle.getVno() + "', `type` = '" 
            + vehicle.getType() +"' WHERE (`id` = '"  + 
              vehicle.getId() + "')");
            
            return rows > 0;
            
        } catch (SQLException e) {
            System.out.println(e);
        }  
         return false;
    }
    
    public boolean deleteDriver(int id){
    Connection connection = DBUtills.getConnection(); 
     
        try{
          Statement stmt=connection.createStatement();
           
          int rows=stmt.executeUpdate(" DELETE FROM `drivers` WHERE "
           + "(`id`='"+id+"');");
      		
	    return rows>0;
	
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean deleteVehicle(int id){
    Connection connection = DBUtills.getConnection(); 
     
        try{
          Statement stmt=connection.createStatement();
           
          int rows=stmt.executeUpdate(" DELETE FROM `vehicles` WHERE "
           + "(`id`='"+id+"');");
      		
	    return rows>0;
	
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }

      public SalesDetails getSales(String branch) {
        SalesDetails sale = null;
                try {
            Connection connection = DBUtills.getConnection();
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(booking.pickup) ,branch FROM sales JOIN drivers on sales.driverId=drivers.id"
                    + " JOIN booking on sales.bookingId=booking.id WHERE branch='" + branch + "'");
            
            while(resultSet.next()) {
                sale= new SalesDetails(resultSet.getString("branch"), 
                      
                        resultSet.getString("pick"));
                
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }    
        return sale;
    }
    
}
