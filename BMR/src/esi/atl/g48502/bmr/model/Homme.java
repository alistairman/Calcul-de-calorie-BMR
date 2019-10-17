
package esi.atl.g48502.bmr.model;

/**
 *the class that represent a man
 * @author alistairclerebaut
 */
public class Homme {
    
    private double poids;
    private double taille;
    private double age;

    
    /**
     * the method that create a representaiton of man
     * @param poids the weight of the man
     * @param taille the height of the man
     * @param age the age of the man
     */
    public Homme(double poids, double taille, double age) {
        this.poids = poids;
        this.taille = taille;
        this.age = age;
    }

    /**
     * the method make the weight accessible
     * @return the wieght of the man
     */
    public double getPoids() {
        return poids;
    }

    
    /**
     * the method make the height accessible
     * @return the height of the man
     */
    public double getTaille() {
        return taille;
    }

    /**
     * the method make the age accessible
     * @return the age of the man
     */
    public double getAge() {
        return age;
    }
    
    
    /**
     * the method that calculation the BMR of man
     * @return the value of BMR
     */
    public int bmr(){
        return (int)((int) (13.7*poids)+(5*taille)-(6.8*age)+66);
    }
    
    /**
     * 
     * the method that calculation the calorie of man
     * @param niveau the level depend of the activity level
     * @return the value of calorie
     */
    public int calorie(double niveau){
        return (int) ((int)bmr()*niveau);
    }
    
}
