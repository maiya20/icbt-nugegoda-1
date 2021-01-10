/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.mywebapp;

/**
 *
 * @author PC
 */
public class Utils {
    public static boolean authentication(String username, String password){
        //TODO : these need  to be loaded from the database 
        return username.equals("admin")  && password.equals("admin123") ;
    }
}
