
package esi.atl.g48502.bmr.model;

/**
 *class that represent a woman 
 * @author alistairclerebaut
 */
public class Femme extends Personne{
    
   
    

    
    /**
     * the method that calculation the BMR of woman
     * @return the value of BMR
     */
    @Override
    public void bmr(){
        super.bmr = Math.round((9.6*super.poids)+(1.8*super.taille)-
                (4.7*super.age)+655);
        notifyObservers();

    }
    
    
}
