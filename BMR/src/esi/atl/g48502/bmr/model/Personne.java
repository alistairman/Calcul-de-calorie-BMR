
package esi.atl.g48502.bmr.model;

import java.util.Observable;

/**
 *
 * @author alistairclerebaut
 */
public class Personne extends Observable{
    
    protected double poids;
    protected double taille;
    protected int age;
    protected double bmr;
    protected double calorie;

    public double getBmr() {
        return bmr;
    }

    public double getPoids() {
        return poids;
    }

    public double getTaille() {
        return taille;
    }

    
    public double getCalorie() {
        return calorie;
    }
    
   

    public void setPoids(double poids) {
        this.poids = poids;
        notifyObservers();
    }

    public void setTaille(double taille) {
        this.taille = taille;
        notifyObservers();
    }

    public void setAge(int age) {
        this.age = age;
        notifyObservers();
    }
    
    public void bmr(){
        
    }

    /**
     * 
     * the method that calculation the calorie of man
     * @param niveau the level depend of the activity level
     * @return the value of calorie
     */
    public void calorie(Activities niveau){
        calorie = (int) ((int) bmr*niveau.getNb());
        notifyObservers();
    }
    
    public void notifyObserver(){
        setChanged();
        notifyObservers();
    }
    
}
