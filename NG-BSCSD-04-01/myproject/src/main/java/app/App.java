/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import business.BuisnessOperations;
import db.DBUtil;
import db.MySQLUtil;
import db.OracleUtil;


/**
 *
 * @author PC
 */
public class App {
    public static void main(String[] args) {
        DBUtil util = new OracleUtil();
        
        BuisnessOperations operations = new BuisnessOperations();
        operations.process(util);
    }
}
