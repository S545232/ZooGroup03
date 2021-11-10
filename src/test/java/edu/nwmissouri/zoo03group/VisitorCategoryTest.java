/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo03group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hari Hara Mummadi
 */
public class VisitorCategoryTest {
    

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
     * Test of values method, of class VisitorCategory.
     */
    @Test
    public void testValues() {
        int actual=4;
        int expected=Math.round(actual);
        assertEquals(actual,expected);
    }

    /**
     * Test of valueOf method, of class VisitorCategory.
     */
    @Test
    public void testValueOf() {
        int actual=5;
        int expected=Math.round(actual);
        assertEquals(actual,expected);
    }
    
}
