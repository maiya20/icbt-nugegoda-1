/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author PC
 */
public class MySQLUtil implements DBUtil{

    @Override
    public void addStudent() {
        System.out.println("Adding Student to MySQL Database");
    }

    @Override
    public void getStudent() {
        System.out.println("Reading Student to MySQL Database");

    }

    @Override
    public void updateUpdaete() {
        System.out.println("Updating Student to MySQL Database");
    }

    @Override
    public void deleteStudent() {
        System.out.println("Deleting Student to MySQL Database");
    }
    
}
