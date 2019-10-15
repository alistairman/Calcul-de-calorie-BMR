/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.vieuw;


import esi.atl.g48502.bmr.model.Activities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public abstract class Vieuw extends Application{
    
    
    private List<Activities> activity;
    private TextField text1 ;
    private TextField text2 ;
    private TextField text3 ;
    private TextField text4 ;
    private TextField text5 ;

    BorderPane root;
    VBox vBox;
    HBox hBox;
    GridPane gridPane1;
    GridPane gridPane2;
    Label label1;
    Label label2;
    Label label3;
    Label label4;
    Label label5;
    Label label6;
    Label label7;
    
    RadioButton radioButton1;
    RadioButton radioButton2;
    
    ChoiceBox choiceBox ;
    
    Label label8 ;
    Label label9 ;
    
    Button button;

    public Vieuw() {
        
        this.activity = new ArrayList<>();
        activity.addAll(Arrays.asList(Activities.values()));
        
        this.text1 = new TextField();
        this.text2 = new TextField();
        this.text3 = new TextField();
        this.text4 = new TextField();
        this.text5 = new TextField();
        this.root = new BorderPane();
        this.vBox = new VBox(12);
        this.hBox= new HBox();
        this.gridPane1 = new GridPane();
        this.gridPane2  = new GridPane();
        this.label1 = new Label(" Données ");
        this.label2 =  new Label(" Résultats ");
        this.label3 = new Label(" Taille (cm) ");
        this.label4 = new Label(" Poids (Kg) ");
        this.label5  = new Label(" Age (années) ");
        this.label6  = new Label(" Sexe ");
        this.label7 = new Label(" Style de vie ");
        
        this.radioButton1 =  new RadioButton("Homme");
        this.radioButton2 =  new RadioButton("Femme");
        
        this.choiceBox = new ChoiceBox();
        
        this.label8 = new Label(" BMR ");
        this.label9 = new Label(" Calories "); 
        
        this.button = new Button(" Caclul du BMR ");
        
        
    }

    public TextField getText1() {
        return text1;
    }

    public TextField getText2() {
        return text2;
    }

    public TextField getText3() {
        return text3;
    }

    public TextField getText4() {
        return text4;
    }

    public TextField getText5() {
        return text5;
    }

    public RadioButton getRadioButton1() {
        return radioButton1;
    }

    public RadioButton getRadioButton2() {
        return radioButton2;
    }

    public Button getButton() {
        return button;
    }

    public ChoiceBox getChoiceBox() {
        return choiceBox;
    }
    
    
    
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
        vBox.setVisible(true);
        root.setCenter(vBox);
        
        
        hBox.setVisible(true);
        hBox.setAlignment(Pos.CENTER);
        
        vBox.getChildren().add(hBox);
        
        gridPane1.setAlignment(Pos.TOP_LEFT);
        gridPane1.setPadding(new Insets(30));
        gridPane1.setHgap(10);
        gridPane1.setVgap(10);
        
        gridPane2.setAlignment(Pos.BASELINE_RIGHT);
        gridPane2.setPadding(new Insets(30));
        gridPane2.setHgap(10);
        gridPane2.setVgap(10);
        
        hBox.getChildren().add(gridPane1);
        hBox.getChildren().add(gridPane2);
        
        label1.setUnderline(true);
        label2.setUnderline(true);

        gridPane1.add(label1, 1, 0);
        gridPane2.add(label2, 1, 0);
        gridPane1.add(label3, 0, 2);
        gridPane1.add(label4, 0, 3);
        gridPane1.add(label5, 0, 4);
        gridPane1.add(label6, 0, 5);
        gridPane1.add(label7, 0, 7);
        
        text1.setPrefColumnCount(15);
        gridPane1.add(text1, 1, 2);
        
        
        text1.setPrefColumnCount(15);
        gridPane1.add(text2, 1, 3);
        
        
        text1.setPrefColumnCount(15);
        gridPane1.add(text3, 1, 4);
        
        gridPane1.add(radioButton1, 1, 5);
        gridPane1.add(radioButton2, 1, 6);

        choiceBox.setItems(FXCollections.observableArrayList(this.activity));
        gridPane1.add(choiceBox, 1, 7);
        
        gridPane2.add(label8, 0, 1);
        gridPane2.add(label9, 0, 2);
        
        text1.setPrefColumnCount(15);
        gridPane2.add(text4, 1, 1);
        gridPane2.add(text5, 1, 2);
        
        
        button.setPrefWidth(700);
        button.setAlignment(Pos.CENTER);
        vBox.getChildren().add(button);
        
        
        
        Scene scene = new Scene(root, 700, 350);
        
        primaryStage.setTitle(" Calcul du BMR ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    
    
}
