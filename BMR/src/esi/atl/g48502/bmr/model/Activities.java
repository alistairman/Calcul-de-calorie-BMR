
package esi.atl.g48502.bmr.model;

/**
 *class enumeration of level of activities
 * @author alistairclerebaut
 */
public enum Activities {
    SEDENTAIRE(1.2), PEU_ACTIF(1.375), ACTIF(1.55), FORT_ACTIF(1.725) ,EXTREME_ACTIF(1.9);
    
    private double nb;
    
    Activities(double nbAct){
        nb = nbAct;
    }

    public double getNb() {
        return nb;
    }
    
    
}
