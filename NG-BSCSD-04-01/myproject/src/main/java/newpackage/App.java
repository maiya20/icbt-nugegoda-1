/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author PC
 */
public class App {
    public static void main(String[] args) {
        
        Person [] person = new Person[4];
        person [0] = new Student("ST01", "Mahela", "Salgado");
        person [1] = new Student("ST02", "Will", "Genia");
        person [2] = new Employee("1","Quade","Cooper");
        person [3] = new Employee("1","Ashley","Cooper");
        
        for(int i=0; i<person.length; i++){
            System.out.println(person [i].getFirstName());
        }
        
        
    }
}
