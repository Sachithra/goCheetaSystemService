/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.gocheethaserver;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "AdminService")
public class AdminService {

    /**
     * This is a sample web service operation
     * @param username
     * @param password
     * @return 
     */
    @WebMethod(operationName = "loginAdmin")
    public Admin loginAdmin(@WebParam(name = "username") String username,
    @WebParam(name = "password")String password)  {
    AdminOperations adminOpe=new AdminOperations();
    return  adminOpe.loginAdmin(username, password);
    }
    
    
    @WebMethod(operationName = "registerDriver")
    public boolean registerDriver(@WebParam(name="driver")Drivers driver){
        AdminOperations admminOpe=new AdminOperations();
        return admminOpe.registeDriver(driver);
    }
    
    @WebMethod(operationName = "addVehicle")
    public boolean addVehicle(@WebParam(name="driver")Vehicle vehicle){
        AdminOperations admminOpe=new AdminOperations();
        return admminOpe.addVehicle(vehicle);
    }
    
    
    @WebMethod(operationName = "updateDriver")
    public boolean updateDriver(@WebParam(name="driver")Drivers driver){
        AdminOperations admminOpe=new AdminOperations();
        return admminOpe.updateDriver(driver);
    }
    
     @WebMethod(operationName = "updateVehicle")
    public boolean updateVehicle(@WebParam(name="driver")Vehicle vehicle){
        AdminOperations admminOpe=new AdminOperations();
        return admminOpe.updateVehicle(vehicle);
    }

    @WebMethod(operationName = "deleteDriver")
    public boolean deleteDriver(@WebParam(name="id")int id){
        AdminOperations admminOpe=new AdminOperations();
        return admminOpe.deleteDriver(id);
    }
    
    
     @WebMethod(operationName = "deleteVehicle")
    public boolean deleteVehicle(@WebParam(name="id")int id){
        AdminOperations admminOpe=new AdminOperations();
        return admminOpe.deleteVehicle(id);
    }
     @WebMethod(operationName = "getSales")
     public SalesDetails getSales (@WebParam(name = "branch") String branch) {
      AdminOperations admminOpe=new AdminOperations();
       return admminOpe.getSales(branch);
    }
}
