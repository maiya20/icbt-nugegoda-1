/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

/**
 *
 * @author tharik
 */
public class App {
   public static void main(String [] args) {
      //  System.out.println("Hello World");
        
        
         System.out.println(Student.STUDENT_CODE);
         
         Student st = new Student();
         Student st2 = new Student();
         st2.firstName = "George";
         
         System.out.println(st.firstName);
         System.out.println(st.lastName);
         
         st.lastName = "xwdewqbejwqehjqrhewwr";
        
         
         System.out.println(st2.firstName);
         System.out.println(st2.lastName);
         
        
   }    
   
//   
//   void method1() {
//       System.out.println("Hello World");
//   }
   
}
