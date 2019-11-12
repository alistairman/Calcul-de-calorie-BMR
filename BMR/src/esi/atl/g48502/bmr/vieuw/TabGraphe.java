package esi.atl.g48502.bmr.vieuw;

import esi.atl.g48502.bmr.model.Homme;
import esi.atl.g48502.bmr.model.Personne;
import esi.atl.g48502.bmr.util.Observer;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 *the class represent the different graphic tab
 * @author alistairclerebaut
 */
public class TabGraphe extends TabPane implements Observer {
    private GrapheBmr grapheBmrVsWeight;
    private GrapheBmr grapheCalorieVsWeight;
    private GrapheBmr grapheBmrVsHeight;
    private GrapheBmr grapheCalorieVsHeight;
    
    /**
     * the method that create and set different graphic tab
     */
    TabGraphe(){
        
        grapheBmrVsWeight = new GrapheBmr(new NumberAxis(),
        new NumberAxis(),"Weight","BMR","Bmr Vs Weight");
        Tab tabBmrVsWeight = new Tab("Bmr Vs Weight");
        tabBmrVsWeight.setContent(grapheBmrVsWeight);
        
        grapheCalorieVsWeight = new GrapheBmr(new NumberAxis(),
                new NumberAxis(),"Weight","Calorie","Calorie Vs Weight");
        Tab tabCalorieVsWeight = new Tab("Calorie Vs Weight");
        tabCalorieVsWeight.setContent(grapheCalorieVsWeight);
        
         grapheBmrVsHeight = new GrapheBmr(new NumberAxis(),
                new NumberAxis(),"Height","BMR","Bmr Vs Height");
        Tab tabBmrVsHeight = new Tab("Bmr Vs Height");
        tabBmrVsHeight.setContent(grapheBmrVsHeight);
        
         grapheCalorieVsHeight = new GrapheBmr(new NumberAxis(),
                new NumberAxis(),"Height","Calorie","Calorie Vs Height");
        Tab tabCalorieVsHeight = new Tab("Calorie Vs Height");
        tabCalorieVsHeight.setContent(grapheCalorieVsHeight);
        
        this.getTabs().addAll(tabBmrVsWeight,tabCalorieVsWeight,tabBmrVsHeight,
                tabCalorieVsHeight);
    }
    
    /**
     * the method that set the value of different graphic tab with persone values
     * @param personne the new value of person will be set  
     */
    public void afficherTabGraphe(Personne personne){
            if(personne instanceof Homme){
            grapheBmrVsWeight.addHommeData(personne.getPoids(),personne.getBmr());
            grapheCalorieVsWeight.addHommeData(personne.getPoids(),personne.getCalorie());
            grapheBmrVsHeight.addHommeData(personne.getTaille(),personne.getBmr());
            grapheCalorieVsHeight.addHommeData(personne.getTaille(),personne.getCalorie());

        }else{
            grapheBmrVsWeight.addFemmeData(personne.getPoids(),personne.getBmr());
            grapheCalorieVsWeight.addFemmeData(personne.getPoids(),personne.getCalorie());
            grapheBmrVsHeight.addFemmeData(personne.getTaille(),personne.getBmr());
            grapheCalorieVsHeight.addFemmeData(personne.getTaille(),personne.getCalorie());
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
