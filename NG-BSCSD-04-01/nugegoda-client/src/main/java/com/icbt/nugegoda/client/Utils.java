/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.nugegoda.client;

import my.service.NewWebService;
import my.service.NewWebService_Service;
import my.service.User;

/**
 *
 * @author tharik
 */
public class Utils {
    public static User authenticate(String username, String password) {
        //TODO : These needs to be loaded from a DB
        
         NewWebService_Service service = new NewWebService_Service();
         NewWebService proxy = service.getNewWebServicePort();
         
        return proxy.authenticate(username, password);
                
      
    }
}
