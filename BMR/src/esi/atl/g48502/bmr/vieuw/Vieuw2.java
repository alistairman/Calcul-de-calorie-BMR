
package esi.atl.g48502.bmr.vieuw;

import esi.atl.g48502.bmr.model.Activities;
import esi.atl.g48502.bmr.model.Femme;
import esi.atl.g48502.bmr.model.Homme;
import static java.lang.Integer.parseInt;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *the class that represent the users interface
 * @author alistairclerebaut
 */
public class Vieuw2 extends Vieuw{
    
    private Homme homme;
    private Femme femme;
    
    
    /**
     * create the interface with initial components
     */
    public Vieuw2(){
        super();
    }
    
    
    /**
     * the method that select the value of activity choised 
     * @param act the activity choised 
     * @return the velue of the activity
     */
    public double act(Activities act){
        double nb=0;
        switch(act){
            case SEDENTAIRE: nb=1.2; break;
            case PEU_ACTIF : nb=1.375; break;
            case ACTIF: nb=1.55; break;
            case FORT_ACTIF : nb=1.725; break;
            case EXTREME_ACTIF: nb=1.9; break;
            default : nb=0;

        }
        return nb;
    }

    /**
     * the method that set the fonctionality of the user interface
     * @param primaryStage the stage where the interface is set
     */
    @Override
    public void start(Stage primaryStage) {
        super.start(primaryStage); //To change body of generated methods, choose Tools | Templates.
        
        
        
        super.buttonBmrCalcul.setOnAction((ActionEvent e) -> {
            if(super.textSize.getText().isEmpty() || 
                    super.textWeight.getText().isEmpty() || 
                    super.textAge.getText().isEmpty()){
                System.out.println( "\033[31m"+" marche pas");
                
                super.textBmr.setText(" Failed! ");
                super.textBmr.setStyle("-fx-text-fill:red");
                super.textCalorie.setText(" Failed! ");
                super.textCalorie.setStyle("-fx-text-fill:red");
            }
            
            else if(groupRadioButton.getSelectedToggle()==super.radioButtonHomme){
                double poids = parseInt(super.textSize.getText());
                double taille = parseInt(super.textWeight.getText());
                double age = parseInt(super.textAge.getText());
                homme = new Homme (poids,taille,age);
            
                super.textBmr.setText(Integer.toString(homme.bmr()));
                super.textCalorie.setText(Integer.toString(homme.calorie(act((Activities)super.choiceBoxActivity.getValue()))));
            
                }
            
            else if(groupRadioButton.getSelectedToggle()==super.radioButtonFemme){
                double poids = parseInt(super.textSize.getText());
                double taille = parseInt(super.textWeight.getText());
                double age = parseInt(super.textAge.getText());
                femme = new Femme(poids,taille,age);
                
                super.textBmr.setText(Integer.toString(femme.bmr()));
                super.textCalorie.setText(Integer.toString(femme.calorie(act((Activities)super.choiceBoxActivity.getValue()))));
                }
            
        });
        
//        super.buttonClear.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
//           @Override
//           public void handle(ActionEvent event){
//               super.text
//           } 
//        });

        super.buttonClear.setOnAction((ActionEvent e)->{
            super.textSize.clear();
            super.textWeight.clear();
            super.textAge.clear();
            super.textBmr.clear();
            super.textCalorie.clear();
        });
        

        
    }
}

    
    

