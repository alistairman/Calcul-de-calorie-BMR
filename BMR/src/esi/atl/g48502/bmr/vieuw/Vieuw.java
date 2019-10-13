/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.vieuw;

import javafx.application.Application;
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
    
    
    @Override
    public void start(Stage primaryStage) {
        
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
        BorderPane root = new BorderPane();
        VBox vBox = new VBox(12);
        vBox.setVisible(true);
        //root.setPadding(new Insets(10));

        root.setCenter(vBox);
        
        HBox hBox = new HBox();
        hBox.setVisible(true);
        hBox.setAlignment(Pos.CENTER);
        
        
        vBox.getChildren().add(hBox);
        //hBox.setPadding(new Insets(20));
        
        GridPane gridPane1 = new GridPane();
        //gridPane1.setGridLinesVisible(true);
        gridPane1.setAlignment(Pos.TOP_LEFT);
        gridPane1.setPadding(new Insets(30));
        gridPane1.setHgap(10);
        gridPane1.setVgap(10);
        
        
        
        GridPane gridPane2 = new GridPane();
        //gridPane2.setGridLinesVisible(true);
        gridPane2.setAlignment(Pos.BASELINE_RIGHT);
        gridPane2.setPadding(new Insets(30));
        gridPane2.setHgap(10);
        gridPane2.setVgap(10);
        
        hBox.getChildren().add(gridPane1);
        hBox.getChildren().add(gridPane2);
        
        
        Label label1 = new Label(" Données ");
        label1.setUnderline(true);
        Label label2 = new Label(" Résultats ");
        label2.setUnderline(true);

        gridPane1.add(label1, 1, 0);
   
        gridPane2.add(label2, 1, 0);

        Label label3 = new Label(" Taille (cm) ");
        Label label4 = new Label(" Poids (Kg) ");
        Label label5 = new Label(" Age (années) ");
        Label label6 = new Label(" Sexe ");
        Label label7 = new Label(" Style de vie ");
        
        gridPane1.add(label3, 0, 2);
        
        gridPane1.add(label4, 0, 3);
        gridPane1.add(label5, 0, 4);
        gridPane1.add(label6, 0, 5);
        gridPane1.add(label7, 0, 7);
        
        TextField text1 = new TextField();
        text1.setPrefColumnCount(15);
        gridPane1.add(text1, 1, 2);
        
        TextField text2 = new TextField();
        text1.setPrefColumnCount(15);
        gridPane1.add(text2, 1, 3);
        
        TextField text3 = new TextField();
        text1.setPrefColumnCount(15);
        //text3.setPadding(new Insets(10));
        gridPane1.add(text3, 1, 4);
        
        RadioButton radioButton1 = new RadioButton("Femme");
        RadioButton radioButton2 = new RadioButton("Homme");
        gridPane1.add(radioButton1, 1, 5);
        gridPane1.add(radioButton2, 1, 6);

        ChoiceBox choiceBox = new ChoiceBox();
        //choiceBox.valueProperty()
        gridPane1.add(choiceBox, 1, 7);
        
        Label label8 = new Label(" BMR ");
        Label label9 = new Label(" Calories "); 
        
        gridPane2.add(label8, 0, 1);
        gridPane2.add(label9, 0, 2);
        
        TextField text4 = new TextField();
        text1.setPrefColumnCount(15);
        gridPane2.add(text4, 1, 1);
        
        TextField text5 = new TextField();
        text1.setPrefColumnCount(15);
        gridPane2.add(text5, 1, 2);
        
        Button button = new Button(" Caclul du BMR ");
        button.setPrefWidth(700);
        button.setAlignment(Pos.CENTER);
        vBox.getChildren().add(button);
        
        
        
        
        
        Scene scene = new Scene(root, 700, 350);
        
        primaryStage.setTitle(" Calcul du BMR ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
   
    
    
}
