/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.controler;

import esi.atl.g48502.bmr.model.Model_Bmr;
import esi.atl.g48502.bmr.vieuw.Vieuw;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author alistairclerebaut
 */
public abstract class Controler extends Application{
    Vieuw vieuw;
    Model_Bmr model;
    
    @Override
    public void start(Stage primaryStage) {
        vieuw = new Vieuw();
        model = new Model_Bmr();
       
        vieuw.setTextButton(model.getButton(),"Say 'Hello World'");
        model.getButton().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                vieuw.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(model.getButton());
        
        Scene scene = new Scene(root, 300, 250);
    
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }
    
}
