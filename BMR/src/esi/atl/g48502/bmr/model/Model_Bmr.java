/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.model;

import esi.atl.g48502.bmr.controler.Controler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author alistairclerebaut
 */
public class Model_Bmr extends Controler{
    
    Button button;
    ChoiceBox choiceBox;
    

    public Model_Bmr() {
        
        this.button = new Button();
        this.choiceBox =  new ChoiceBox();
        
    }

    public Button getButton() {
        return button;
    }

    public ChoiceBox getChoiceBox() {
        return choiceBox;
    }
    

    
    
}
