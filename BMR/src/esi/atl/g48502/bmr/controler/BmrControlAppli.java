package esi.atl.g48502.bmr.controler;

import esi.atl.g48502.bmr.model.Femme;
import esi.atl.g48502.bmr.model.Homme;
import esi.atl.g48502.bmr.model.Personne;
import esi.atl.g48502.bmr.util.Observer;
import esi.atl.g48502.bmr.vieuw.VieuwBmr;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 * the class that represent the users interface
 * that class control diferent actions done on application
 * and launch the application
 * @author alistairclerebaut
 */
public class BmrControlAppli extends Application implements Observer {
    
    private Personne personne = new Personne();
    private final VieuwBmr vieuw = new VieuwBmr();

    /**
     * we launch the application here
     * @param args the diferent arguments of command line
     */
    public static void main(String[] args) {   
        launch();
    }
    /**
     * the method that set the actions must be done on the user interface
     * @param primaryStage the stage where the interface is set
     */
    @Override
    public void start(Stage primaryStage) {
        
        vieuw.start(primaryStage);
        vieuw.getButtonVieuw().getButtonBmrCalcul().
                setOnAction((ActionEvent e) -> {
            if(vieuw.isEmptyInput() || vieuw.zeroInput()){
                vieuw.invalidInput();
                Alert error = new Alert(Alert.AlertType.ERROR,
                    "WARNING",ButtonType.CLOSE);
                error.showAndWait();
            }
            else if(vieuw.isHommeSelected()){
                
                personne = new Homme ();
                personne.addObserver(this);
                personne.setAge(vieuw.getInput().getAge());
                personne.setPoids(vieuw.getInput().getWeight());
                personne.setTaille(vieuw.getInput().getSize());
                personne.bmr();
                personne.calorie(vieuw.getActivity());
                vieuw.getGraphic().afficherTabGraphe(personne);
            }
            else if(vieuw.isFemmeSelected()){
                
                personne = new Femme ();
                personne.addObserver(this);
                personne.setAge(vieuw.getInput().getAge());
                personne.setPoids(vieuw.getInput().getWeight());
                personne.setTaille(vieuw.getInput().getSize());
                personne.bmr();
                personne.calorie(vieuw.getActivity());
                vieuw.getGraphic().afficherTabGraphe(personne);
            }
        });
        vieuw.getButtonVieuw().getButtonClear().setOnAction((ActionEvent e)->{
            vieuw.getOutput().reset();
            vieuw.getInput().reset();
        });
    }
    
    @Override
    public void update() {
        vieuw.getOutput().setTextBmr(Double.toString(personne.getBmr()));
        vieuw.getOutput().setTextCalorie(Double.toString(personne.getCalorie()));
    }
}