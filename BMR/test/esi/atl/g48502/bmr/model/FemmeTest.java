
package esi.atl.g48502.bmr.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *the test class of Femme
 * @author alistairclerebaut
 */
public class FemmeTest {
  
    /**
     * Test of getPoids method, of class Femme.
     */
    @Test
    public void testGetPoids() {
        Femme instance = new Femme(0,2,3);
        double expResult = 0;
        double result = instance.getPoids();
        assertTrue(expResult==result);
    }

    /**
     * Test of getTaille method, of class Femme.
     */
    @Test
    public void testGetTaille() {
        Femme instance = new Femme(1,2,3);
        double expResult = 2;
        double result = instance.getTaille();
        assertTrue(expResult==result);
    }

    /**
     * Test of getAge method, of class Femme.
     */
    @Test
    public void testGetAge() {
        Femme instance = new Femme(1,2,-5);
        double expResult = -5;
        double result = instance.getAge();
        assertTrue(expResult==result);
    }

    /**
     * Test of bmr method, of class Femme.
     */
    @Test
    public void testBmr() {
        
        Femme instance = new Femme(1,1,1);
        int expResult = (int)661.7;
        int result = instance.bmr();
        assertEquals(expResult, result);
    }

    /**
     * Test of calorie method, of class Femme.
     */
    @Test
    public void testCalorie() {
        double niveau = 0.0;
        Femme instance = new Femme (1,2,3);
        int expResult = 0;
        int result = instance.calorie(niveau);
        assertEquals(expResult, result);
    }
    
}
