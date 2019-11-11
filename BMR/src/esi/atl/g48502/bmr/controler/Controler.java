
package esi.atl.g48502.bmr.controler;

import esi.atl.g48502.bmr.model.Activities;
import esi.atl.g48502.bmr.model.Femme;
import esi.atl.g48502.bmr.model.Homme;
import esi.atl.g48502.bmr.model.Personne;
import esi.atl.g48502.bmr.vieuw.GrapheBmr;
import esi.atl.g48502.bmr.vieuw.VieuwBmr;
import static java.lang.Integer.parseInt;
import java.util.Observable;
import java.util.Observer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *the class that represent the users interface
 * that class control diferent actions done on application
 * @author alistairclerebaut
 */
public class Controler implements Observer {
    
    
    
    private Personne personne;
    private final VieuwBmr vieuw;
    private Stage primaryStage;
    
    
    /**
     * create the interface with initial components
     * @param primaryStage where the interface is launched
     */
    public Controler(Stage primaryStage){
        this.vieuw = new VieuwBmr(primaryStage);
        personne = new Personne();
    }

    /**
     * method make the vieuw class accessible
     * @return the class of vieuw
     */
    public VieuwBmr getVieuw() {
        return vieuw;
    }


    /**
     * the method that set the actions must be done on the user interface
     * @param primaryStage the stage where the interface is set
     */
    public void start(Stage primaryStage) {
        personne.addObserver(this);
        
        vieuw.getButtonVieuw().getButtonBmrCalcul().
                setOnAction((ActionEvent e) -> {
            if(vieuw.getInput().getTextSize().getText().isEmpty() || 
                    vieuw.getInput().getTextWeight().
                            getText().isEmpty() || 
                    vieuw.getInput().getTextAge().getText().isEmpty()){
                System.out.println( "\033[31m"+" marche pas");
                
                vieuw.getOutput().setTextBmr(" Failed! ");
                vieuw.getOutput().getTextBmr().setStyle("-fx-text-fill:red");
                vieuw.getOutput().setTextCalorie(" Failed! ");
                vieuw.getOutput().getTextCalorie().setStyle("-fx-text-fill:red");
            }
            
            else if(vieuw.getInput().getGroupRadioButton().getSelectedToggle()==
                    vieuw.getInput().getRadioButtonHomme()){
                
                personne = new Homme ();
                personne.setAge(vieuw.getInput().getAge());
                personne.setPoids(vieuw.getInput().getWeight());
                personne.setTaille(vieuw.getInput().getSize());
                personne.bmr();
                personne.calorie(vieuw.getActivity());
                vieuw.getOutput().setTextBmr(Double.toString((personne.getBmr())));
                vieuw.getOutput().setTextCalorie(Double.toString(personne.getCalorie()));
                vieuw.getGraphic().upDate(personne);
            }
            
            else if(vieuw.getInput().getGroupRadioButton().getSelectedToggle()==
                    vieuw.getInput().getRadioButtonFemme()){
                
                personne = new Femme ();
                personne.setAge(vieuw.getInput().getAge());
                personne.setPoids(vieuw.getInput().getWeight());
                personne.setTaille(vieuw.getInput().getSize());
                personne.bmr();
                personne.calorie(vieuw.getActivity());
                vieuw.getOutput().setTextBmr(Double.toString((personne.getBmr())));
                vieuw.getOutput().setTextCalorie(Double.toString(personne.getCalorie()));
                vieuw.getGraphic().upDate(personne);
            }
            
        });
        
        vieuw.getButtonVieuw().getButtonClear().setOnAction((ActionEvent e)->{
            vieuw.getOutput().reset();
            vieuw.getInput().reset();
        });
        
        
       
    }
    

    public void update() {
        
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}