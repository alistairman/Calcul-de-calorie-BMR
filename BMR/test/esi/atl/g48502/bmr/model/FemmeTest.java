
package esi.atl.g48502.bmr.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *the test class of Femme
 * @author alistairclerebaut
 */
public class FemmeTest {

    /**
     * Test of bmr method, of class Femme.
     */
    @Test
    public void testBmr() {
        
        Personne instance = new Femme();
        instance.setAge(0);
        instance.setTaille(0);
        instance.setPoids(0);
        instance.bmr();
        int expResult = (int)655;
        int result =(int) instance.getBmr();
        assertEquals(expResult, result);
    }

    /**
     * Test of calorie method, of class Femme.
     */
    @Test
    public void testCalorie() {
        
        Personne instance = new Femme ();
        instance.setAge(0);
        instance.setTaille(0);
        instance.setPoids(0);
        instance.bmr();
        int expResult = 1015;
        instance.calorie(Activities.ACTIF);
        int result = (int)instance.getCalorie();
        assertEquals(expResult, result);
    }
    
}
