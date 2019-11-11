
package esi.atl.g48502.bmr.model;

/**
 *the class that represent a man
 * @author alistairclerebaut
 */
public class Homme extends Personne{

    /**
     * the method that calculation the BMR of man
     * @return the value of BMR
     */
    @Override
    public void bmr(){
        super.bmr = Math.round((13.7*super.poids)+(5*super.taille)-
                (6.8*super.age+66));
        notifyObservers();
    }
}
