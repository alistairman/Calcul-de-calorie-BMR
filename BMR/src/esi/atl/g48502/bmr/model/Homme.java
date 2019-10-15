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
public class Homme {
    
    private double poids;
    private double taille;
    private double age;

    public Homme(double poids, double taille, double age) {
        this.poids = poids;
        this.taille = taille;
        this.age = age;
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
        return (int)((int) (13.7*poids)+(5*taille)-(6.8*age)+66);
    }
    
    public int calorie(double niveau){
        return (int) ((int)bmr()*niveau);
    }
    
}
