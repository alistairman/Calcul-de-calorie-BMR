
package esi.atl.g48502.bmr.vieuw;

import esi.atl.g48502.bmr.model.Activities;
import esi.atl.g48502.bmr.model.Femme;
import esi.atl.g48502.bmr.model.Homme;
import static java.lang.Integer.parseInt;
import javafx.event.ActionEvent;
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
        
        
        
        super.getButton().setOnAction((ActionEvent e) -> {
            if(super.text1.getText().isEmpty() || 
                    super.text2.getText().isEmpty() || 
                    super.text3.getText().isEmpty()){
                System.out.println( "\033[31m"+" marche pas");
                
                super.text4.setText(" Failed! ");
                super.text4.setStyle("-fx-text-fill:red");
                super.text5.setText(" Failed! ");
                super.text5.setStyle("-fx-text-fill:red");
            }
            
            else if(group.getSelectedToggle()==super.radioButton1){
                double poids = parseInt(super.text1.getText());
                double taille = parseInt(super.text2.getText());
                double age = parseInt(super.text3.getText());
                homme = new Homme (poids,taille,age);
            
                super.text4.setText(Integer.toString(homme.bmr()));
                super.text5.setText(Integer.toString(homme.calorie(act((Activities)super.choiceBox.getValue()))));
            
                }
            
            else if(group.getSelectedToggle()==super.radioButton2){
                double poids = parseInt(super.text1.getText());
                double taille = parseInt(super.text2.getText());
                double age = parseInt(super.text3.getText());
                femme = new Femme(poids,taille,age);
                
                super.text4.setText(Integer.toString(femme.bmr()));
                super.text5.setText(Integer.toString(femme.calorie(act((Activities)super.choiceBox.getValue()))));
                }
            
        });
    }
}

    
    

