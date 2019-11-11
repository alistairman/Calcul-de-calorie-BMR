
package esi.atl.g48502.bmr.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *the test class of Homme
 * @author alistairclerebaut
 */
public class HommeTest {
    /**
     * Test of bmr method, of class Femme.
     */
    @Test
    public void testBmr() {
        Personne instance = new Homme ();
        instance.setAge(1);
        instance.setTaille(1);
        instance.setPoids(1);
        instance.bmr();
        int expResult = 54;
        int result = Math.abs((int)instance.getBmr());
        assertEquals(expResult, result);
    }

    /**
     * Test of calorie method, of class Femme.
     */
    @Test
    public void testCalorie() {
        Personne instance = new Homme ();
        instance.setAge(1);
        instance.setTaille(1);
        instance.setPoids(1);
        instance.bmr();
        int expResult = 83;
        instance.calorie(Activities.ACTIF);
        int result = Math.abs((int)instance.getCalorie());
        assertEquals(expResult, result);
    }
    
}
