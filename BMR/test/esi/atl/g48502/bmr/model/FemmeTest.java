/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alistairclerebaut
 */
public class FemmeTest {
    
    public FemmeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPoids method, of class Femme.
     */
    @Test
    public void testGetPoids() {
        System.out.println("getPoids");
        Femme instance = null;
        double expResult = 0.0;
        double result = instance.getPoids();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaille method, of class Femme.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        Femme instance = null;
        double expResult = 0.0;
        double result = instance.getTaille();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Femme.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Femme instance = null;
        double expResult = 0.0;
        double result = instance.getAge();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bmr method, of class Femme.
     */
    @Test
    public void testBmr() {
        System.out.println("bmr");
        Femme instance = null;
        int expResult = 0;
        int result = instance.bmr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calorie method, of class Femme.
     */
    @Test
    public void testCalorie() {
        System.out.println("calorie");
        double niveau = 0.0;
        Femme instance = null;
        int expResult = 0;
        int result = instance.calorie(niveau);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
