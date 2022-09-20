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
@WebService(serviceName = "CustomerService")
public class CustomerService {

    /**
     * This is a sample web service operation
     * @param username
     * @param password
     * @return 
     */
    
    @WebMethod(operationName = "loginCustomer")
    public Customer loginCustomer(@WebParam(name = "username") String username,
    @WebParam(name = "password")String password)  {
    CustomerOperations customeOpe=new CustomerOperations();
    return  customeOpe.loginCutomer(username, password);
    }
    
    
    @WebMethod(operationName = "registerCustomer")
    public boolean registerCustomer(@WebParam(name="customer")Customer customer){
        CustomerOperations customeOpe=new CustomerOperations();
        return customeOpe.registerCustomer(customer);
    }
    
     @WebMethod(operationName = "getVehicle")
     public BookingDetailss getVehicle (@WebParam(name = "type") String type) {
       CustomerOperations customeOpe=new CustomerOperations();
       return customeOpe.getvehicle(type);
    }
    @WebMethod(operationName = "cuBookings")
    public boolean cuBookings(@WebParam(name="place")Placebookings place){
        CustomerOperations customeOpe=new CustomerOperations();
        return customeOpe.cuBookings(place);
    }
    @WebMethod(operationName = "feedBackes")
    public boolean feedBackes(@WebParam(name="driver")Drivers driver){
        CustomerOperations customeOpe=new CustomerOperations();
        return customeOpe.feedBackes(driver);
    }
}
