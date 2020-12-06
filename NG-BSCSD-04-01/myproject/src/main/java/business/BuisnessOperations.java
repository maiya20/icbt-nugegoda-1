/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import db.DBUtil;

/**
 *
 * @author PC
 */
public class BuisnessOperations {
    public void process (DBUtil util){
        util.addStudent();
        util.addStudent();
        
        util.updateUpdaete();
        util.getStudent();
        util.getStudent();
        
        util.deleteStudent();
        
    }
}
