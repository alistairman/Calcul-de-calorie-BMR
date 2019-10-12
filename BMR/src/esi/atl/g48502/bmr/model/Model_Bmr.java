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
    List <Label> labels;
    

    public Model_Bmr() {
        
        this.button = new Button();
        this.choiceBox =  new ChoiceBox();
        labels = new ArrayList<>();
        
    }

    public Button getButton() {
        return button;
    }

    public ChoiceBox getChoiceBox() {
        return choiceBox;
    }
    
    public void addLabel(StackPane root,Label label){
        root.getChildren().add(label);
    }
    
    public void addButton(StackPane root, Button button){
        root.getChildren().add(button);
    }
    
    public void addTextField(StackPane root,TextField text){
        root.getChildren().add(text);
    }
    
    public void addChoiceBox(StackPane root, ChoiceBox box){
        root.getChildren().add(box);
    }
    
    public void addRadioButton(StackPane root, RadioButton btn){
        root.getChildren().add(btn);
    }
    
    public void addGridPane(StackPane root, GridPane grid){
        root.getChildren().add(grid);
    }
    
    public Label newLabel(String string){
        return new Label(string);
    }
    
    
}
