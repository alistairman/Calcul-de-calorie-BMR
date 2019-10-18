
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
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * the class that represente a structure of the user interface
 * @author alistairclerebaut
 */
public abstract class Vieuw extends Application{
    
    
    protected List<Activities> activity;
    protected TextField text1 ;
    protected TextField text2 ;
    protected TextField text3 ;
    protected TextField text4 ;
    protected TextField text5 ;

    protected BorderPane root;
    protected VBox vBox;
    protected HBox hBox;
    protected GridPane gridPane1;
    protected GridPane gridPane2;
    protected Label label1;
    protected Label label2;
    protected Label label3;
    protected Label label4;
    protected Label label5;
    protected Label label6;
    protected Label label7;
    
    protected RadioButton radioButton1;
    protected RadioButton radioButton2;
    
    protected ChoiceBox choiceBox ;
    
    protected Label label8 ;
    protected Label label9 ;
    
    protected Button button;
    protected Button button2;
    
    protected ToggleGroup group;

    /**
     * the method that create the interface of user
     */
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
        this.button2 = new Button("Clear");
        
        this.group = new ToggleGroup();
        
        
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        vBox.setVisible(true);
        root.setCenter(vBox);
        
        
        hBox.setVisible(true);
        hBox.setAlignment(Pos.CENTER);
        hBox.autosize();
        
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
        
        button2.setPrefWidth(700);
        button2.setAlignment(Pos.CENTER);
        vBox.getChildren().add(button2);
        
        this.radioButton1.setToggleGroup(group);
        this.radioButton2.setToggleGroup(group);
        
        
        
        Scene scene = new Scene(root, 700, 400);
        
        primaryStage.setTitle(" Calcul du BMR ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    
    
}
