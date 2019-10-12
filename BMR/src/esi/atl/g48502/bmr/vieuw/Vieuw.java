/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.vieuw;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public abstract class Vieuw extends Application{
    
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        Label label7 = new Label();
        Label label8 = new Label();

        GridPane gridPane1 = new GridPane();
        GridPane gridPane2 = new GridPane();
        
        gridPane1.setGridLinesVisible(true);
        gridPane1.setAlignment(Pos.TOP_LEFT);
        gridPane1.setPadding(new Insets(40) );
        gridPane2.setGridLinesVisible(true);
        gridPane2.setAlignment(Pos.TOP_CENTER);
        
        root.setLeft(gridPane1);
        //gridPane1.setMaxSize(500, 1000);
        root.setCenter(gridPane2);
        
        label1.setText("Données");
        label1.setUnderline(true);
        gridPane1.add(label1, 0, 0);
        
        label2.setText("Résultat");
        label2.setUnderline(true);
        gridPane2.add(label2, 0, 0);
        
        
        label3.setText("Poids");
        gridPane1.add(label3, 0,2);
        
        TextField text1 = new TextField();
        text1.setPrefColumnCount(15);
        gridPane1.add(text1, 1, 2);
        
        //root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 700, 400);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
   
    
    
}
