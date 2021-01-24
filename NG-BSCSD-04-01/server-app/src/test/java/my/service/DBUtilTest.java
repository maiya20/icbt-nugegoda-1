/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.service;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class DBUtilTest {
    
    public DBUtilTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of getUsers method, of class DBUtil.
     */
    @org.junit.Test
    public void testGetUsers_StringArr() {
        System.out.println("getUsers");
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Smith");
        user.setPassword("john123");
        user.setUsername("admin");
                
                
        List<User> result = DBUtil.getUsers();
        assertEquals(user.getFirstName(), result.get(0).getFirstName());
        assertEquals(user.getLastName(), result.get(0).getLastName());
        assertEquals(user.getPassword(), result.get(0).getPassword());
        assertEquals(user.getUsername(), result.get(0).getUsername());

    }

    /**
     * Test of getUsers method, of class DBUtil.
     */
    @org.junit.Test
    public void testGetUsers() {
        System.out.println("getUsers");
        List<User> expResult = null;
        List<User> result = DBUtil.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
