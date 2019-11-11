
package esi.atl.g48502.bmr.model;

/**
 *class enumeration of level of activities
 * @author alistairclerebaut
 */
public enum Activities {
    SEDENTAIRE(1.2), PEU_ACTIF(1.375), ACTIF(1.55), FORT_ACTIF(1.725) ,EXTREME_ACTIF(1.9);
    
    private double nb;
    
    /**
     * method that create and set the activity 
     * @param nbAct the value of the activity 
     */
    Activities(double nbAct){
        nb = nbAct;
    }

    /**
     * the method that make the value of activity accessible
     * @return the value of he activity
     */
    public double getNb() {
        return nb;
    }
    
    
}
