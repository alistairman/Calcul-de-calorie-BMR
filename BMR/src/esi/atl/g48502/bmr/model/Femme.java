/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.model;

/**
 *
 * @author alistairclerebaut
 */
public class Femme {
    
    private double poids;
    private double taille;
    private double age;
    
    
    public Femme(double poids, double taille, double age){
        this.age = age;
        this.poids = poids;
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public double getTaille() {
        return taille;
    }

    public double getAge() {
        return age;
    }
    
    public int bmr(){
        return (int)((int) (9.6*poids)+(1.8*taille)-(4.7*age)+655);
    }
    
    public int calorie(double niveau){
        return (int) ((int)bmr()*niveau);
    }
    
    
}
