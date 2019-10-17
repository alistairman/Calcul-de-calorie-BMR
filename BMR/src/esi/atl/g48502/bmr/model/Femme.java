
package esi.atl.g48502.bmr.model;

/**
 *class that represent a woman 
 * @author alistairclerebaut
 */
public class Femme {
    
    private double poids;
    private double taille;
    private double age;
    
    /**
     * the method that create a woman with specific arguments
     * @param poids the weight of the woman
     * @param taille the height of the woman
     * @param age the age of the woman
     */
    public Femme(double poids, double taille, double age){
        this.age = age;
        this.poids = poids;
        this.taille = taille;
    }

    /**
     * the method of weight
     * @return the weight of the woman
     */
    public double getPoids() {
        return poids;
    }

    /**
     * the method of height
     * @return the height of the woman
     */
    public double getTaille() {
        return taille;
    }
    

    /**
     * the method of the age
     * @return the age of the woman
     */
    public double getAge() {
        return age;
    }
    
    /**
     * the method that calculation the BMR of woman
     * @return the value of BMR
     */
    public int bmr(){
        return (int)((int) (9.6*poids)+(1.8*taille)-(4.7*age)+655);
    }
    
    /**
     * 
     * the method that calculation the calorie of woman
     * @param niveau the level depend of the activity level
     * @return the value of calorie
     */
    public int calorie(double niveau){
        return (int) ((int)bmr()*niveau);
    }
    
    
}
