package esi.atl.g48502.bmr.vieuw;

import esi.atl.g48502.bmr.model.Homme;
import esi.atl.g48502.bmr.model.Personne;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 *the class represent the different graphic tab
 * @author alistairclerebaut
 */
public class TabGraphe extends TabPane{
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
    public void upDate(Personne personne){
        if(personne instanceof Homme){
            grapheBmrVsWeight.addHommeData(personne.getBmr(),personne.getPoids());
            grapheCalorieVsWeight.addHommeData(personne.getCalorie(),personne.getPoids());
            grapheBmrVsHeight.addHommeData(personne.getBmr(),personne.getTaille());
            grapheCalorieVsHeight.addHommeData(personne.getBmr(),personne.getTaille());
        }
        else {
            grapheBmrVsWeight.addFemmeData(personne.getBmr(),personne.getPoids());
            grapheCalorieVsWeight.addFemmeData(personne.getCalorie(),personne.getPoids());
            grapheBmrVsHeight.addFemmeData(personne.getBmr(),personne.getTaille());
            grapheCalorieVsHeight.addFemmeData(personne.getBmr(),personne.getTaille());
        }
    }
}
