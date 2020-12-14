/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int no1 = 6;
        int no2 = 2;
        Calculator instance = new Calculator();
        int expResult = 8;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);
      
    }
    
     @Test
    public void testAddNegativeNum() {
        System.out.println("add");
        int no1 = -6;
        int no2 = -2;
        Calculator instance = new Calculator();
        int expResult = -8;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);
      
    }
    

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        int no1 = 23;
        int no2 = 12;
        Calculator instance = new Calculator();
        int expResult = 11;
        int result = instance.substract(no1, no2);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testSubstractNegativeNum() {
        System.out.println("substract");
        int no1 = -23;
        int no2 = -12;
        Calculator instance = new Calculator();
        int expResult = -11;
        int result = instance.substract(no1, no2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int no1 = 44;
        int no2 = 11;
        Calculator instance = new Calculator();
        int expResult = 4;
        int result = instance.divide(no1, no2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int no1 = 3;
        int no2 = 5;
        Calculator instance = new Calculator();
        int expResult = 15;
        int result = instance.multiply(no1, no2);
        assertEquals(expResult, result);
       
    }
    
}
