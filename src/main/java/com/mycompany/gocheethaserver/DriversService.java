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
@WebService(serviceName = "DriversService")
public class DriversService {

    /**
     * This is a sample web service operation
     * @param name
     * @param phone
     * @return 
     */
    @WebMethod(operationName = "loginDrivers")
    public Drivers loginDrivers(@WebParam(name = "name") String name,
    @WebParam(name = "phone")String phone)  {
    DriverOperations DriverOpe=new DriverOperations();
    return  DriverOpe.loginDriver(name, phone);
    }
}
