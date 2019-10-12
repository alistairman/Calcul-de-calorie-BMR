/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.model;

import esi.atl.g48502.bmr.controler.Controler;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author alistairclerebaut
 */
public class Model_Bmr extends Controler{
    
    Button button;
    ChoiceBox choiceBox;
    
    StackPane root;
    

    public Model_Bmr() {
        
        this.button = new Button();
        this.choiceBox =  new ChoiceBox();
        this.root = new StackPane();
       
    }

    public Button getButton() {
        return button;
    }

    public ChoiceBox getChoiceBox() {
        return choiceBox;
    }

    public StackPane getRoot() {
        return root;
    }
    
    
    
    public void addLabel(Label label){
        root.getChildren().add(label);
    }
    
    public void addButton(){
        this.root.getChildren().add(button);
    }
    
    public void addTextField(){
        root.getChildren().add(new TextField());
    }
    
    public void addChoiceBox(ChoiceBox box){
        root.getChildren().add(box);
    }
    
    public void addRadioButton(RadioButton radio){
        root.getChildren().add(radio);
    }
    
    public void addGridPane(){
        root.getChildren().add(new GridPane());
    }
    
    
    
    
}
