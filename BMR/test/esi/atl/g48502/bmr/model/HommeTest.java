
package esi.atl.g48502.bmr.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *the test class of Homme
 * @author alistairclerebaut
 */
public class HommeTest {
    /**
     * Test of getPoids method, of class Homme.
     */
    @Test
    public void testGetPoids() {
        Homme instance = new Homme(0,2,3);
        double expResult = 0;
        double result = instance.getPoids();
        assertTrue(expResult==result);
    }

    /**
     * Test of getTaille method, of class Femme.
     */
    @Test
    public void testGetTaille() {
        Homme instance = new Homme(1,2,3);
        double expResult = 2;
        double result = instance.getTaille();
        assertTrue(expResult==result);
    }

    /**
     * Test of getAge method, of class Femme.
     */
    @Test
    public void testGetAge() {
        Homme instance = new Homme(1,2,-5);
        double expResult = -5;
        double result = instance.getAge();
        assertTrue(expResult==result);
    }

    /**
     * Test of bmr method, of class Femme.
     */
    @Test
    public void testBmr() {
        
        Homme instance = new Homme(1,1,1);
        int expResult =(int) 77.9;
        int result = instance.bmr();
        assertTrue(expResult==result);
    }

    /**
     * Test of calorie method, of class Femme.
     */
    @Test
    public void testCalorie() {
        double niveau = 1.0;
        Homme instance = new Homme (1,1,1);
        int expResult = (int) 77.9;
        int result = instance.calorie(niveau);
        assertEquals(expResult, result);
    }
    
}
