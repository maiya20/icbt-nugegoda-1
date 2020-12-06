/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

/**
 *
 * @author PC
 */
public class Bird implements Animal{

    @Override
    public void move() {
        System.out.println("Bird is Flying");
    }

    @Override
    public void consume() {
        System.out.println("Bird is Eating");
    }
    
}
