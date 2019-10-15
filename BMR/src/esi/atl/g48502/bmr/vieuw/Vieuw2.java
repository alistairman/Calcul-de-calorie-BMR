/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.vieuw;

import esi.atl.g48502.bmr.model.Activities;
import esi.atl.g48502.bmr.model.Femme;
import esi.atl.g48502.bmr.model.Homme;
import static java.lang.Integer.parseInt;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

/**
 *
 * @author alistairclerebaut
 */
public class Vieuw2 extends Vieuw{
    
    Homme homme;
    Femme femme;
    
    public Vieuw2(){
        super();
    }
    
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

    @Override
    public void start(Stage primaryStage) {
        super.start(primaryStage); //To change body of generated methods, choose Tools | Templates.
        
        
        
        super.getButton().setOnAction((ActionEvent e) -> {
            if(super.getText1().getText().isEmpty() || 
                    super.getText2().getText().isEmpty() || 
                    super.getText3().getText().isEmpty()){
                System.out.println( "\033[31m"+" marche pas");
                
                super.getText4().setText(" Failed! ");
                super.getText4().setStyle("-fx-text-fill:red");
                super.getText5().setText(" Failed! ");
                super.getText5().setStyle("-fx-text-fill:red");
            }
            
            else if(group.getSelectedToggle()==super.radioButton1){
                double poids = parseInt(super.getText1().getText());
                double taille = parseInt(super.getText2().getText());
                double age = parseInt(super.getText3().getText());
                homme = new Homme (poids,taille,age);
            
                super.getText4().setText(Integer.toString(homme.bmr()));
                super.getText5().setText(Integer.toString(homme.calorie(act((Activities)super.choiceBox.getValue()))));
            
                }
            
            else if(group.getSelectedToggle()==super.radioButton2){
                double poids = parseInt(super.getText1().getText());
                double taille = parseInt(super.getText2().getText());
                double age = parseInt(super.getText3().getText());
                femme = new Femme(poids,taille,age);
                
                super.getText4().setText(Integer.toString(femme.bmr()));
                super.getText5().setText(Integer.toString(femme.calorie(act((Activities)super.choiceBox.getValue()))));
                }
            
        });
    }
}

    
    

