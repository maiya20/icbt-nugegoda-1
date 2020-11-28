/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

/**
 *
 * @author tharik
 */
public class App {
    public static void main(String []args) {
        //Student st = new Student("ST01", "John", "Smith");      
        
        Student st  = new Student();
        System.out.println(st.getLastName().trim());
    }
    
}
