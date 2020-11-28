
package newpackage;

/**
 *
 * @author PC
 */
public class Student {
      
    
    public String firstName ;
   
    public String lastName ;
    
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
         this.firstName = firstName.toUpperCase();
    }
      public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
         this.lastName = lastName;
    }
}
