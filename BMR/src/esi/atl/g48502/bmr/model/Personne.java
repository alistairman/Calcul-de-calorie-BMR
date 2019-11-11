package esi.atl.g48502.bmr.model;

import java.util.Observable;

/**
 *the method that represent a person
 * @author alistairclerebaut
 */
public class Personne extends Observable{
    
    protected double poids;
    protected double taille;
    protected int age;
    protected double bmr;
    protected double calorie;

    /**
     * the method that make the Bmr accessible
     * @return the value of the bmr
     */
    public double getBmr() {
        return bmr;
    }

    /**
     * the method that make the weight accessible
     * @return the value of the weight
     */
    public double getPoids() {
        return poids;
    }

    /**
     * the method that make the height accassible
     * @return the value of the height
     */
    public double getTaille() {
        return taille;
    }

    /**
     * the method that make the calorie accessible
     * @return the value of the calorie
     */
    public double getCalorie() {
        return calorie;
    }
    
    /**
     * the method that change the weight
     * @param poids the new value of the weight
     */
    public void setPoids(double poids) {
        this.poids = poids;
        notifyObservers();
    }

    /**
     * the method that change the height
     * @param taille the new value of height
     */
    public void setTaille(double taille) {
        this.taille = taille;
        notifyObservers();
    }

    /**
     * the method that change the age
     * @param age the new value of the age
     */
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
