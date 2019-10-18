
package esi.atl.g48502.bmr.vieuw;


import esi.atl.g48502.bmr.model.Activities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * the class that represente a structure of the user interface
 * @author alistairclerebaut
 */
public class Vieuw{
    
    private Stage primaryStage;
    private BorderPane root;
    
    private MenuOfVbox menuOfVbox;
    
    protected VBox vBox;
    protected HBox hBox;
    
    private GridPaneOfVieuw gridPaneOfVieuw;
    
    private TextFieldOfVieuw textFieldVieuw;
    
    private LabelOfVieuw labelOfVieuw;
    
    private RadioButtonOfVieuw radioButtonVieuw;
    
    private ChoiceBox choiceBoxActivity ;
    
    private ButtonOfVieuw buttonVieuw;
    
    private List<Activities> activity;
    

    /**
     * the method that create the interface of user
     */
    public Vieuw(Stage primaryStage) {
        
        this.primaryStage = primaryStage;
        this.root = new BorderPane();
        
        this.vBox = new VBox(12);
        this.hBox= new HBox();
        
        this.menuOfVbox = new MenuOfVbox(this);
        
        this.gridPaneOfVieuw = new GridPaneOfVieuw(this);
        
        this.textFieldVieuw = new TextFieldOfVieuw(this);
        
        this.labelOfVieuw = new LabelOfVieuw(this);
        this.radioButtonVieuw = new RadioButtonOfVieuw(this);
        this.buttonVieuw = new ButtonOfVieuw(this);
        
        this.choiceBoxActivity = new ChoiceBox();
        
        this.activity = new ArrayList<>();
        activity.addAll(Arrays.asList(Activities.values()));
        
        
    }

    public ButtonOfVieuw getButtonVieuw() {
        return buttonVieuw;
    }
    
    
    public VBox getvBox() {
        return vBox;
    }
    

    public RadioButtonOfVieuw getRadioButtonVieuw() {
        return radioButtonVieuw;
    }

    public TextFieldOfVieuw getTextFieldVieuw() {
        return textFieldVieuw;
    }
   
    public ChoiceBox getChoiceBoxActivity() {
        return choiceBoxActivity;
    }

    public MenuOfVbox getMenuOfVbox() {
        return menuOfVbox;
    }

    public GridPaneOfVieuw getGridPaneOfVieuw() {
        return gridPaneOfVieuw;
    }
    
  
    
    public void start(Stage primaryStage) {
        
        //vBox.setVisible(true);
        root.setCenter(vBox);
        
        //hBox.setVisible(true);
        hBox.setAlignment(Pos.CENTER);
        hBox.autosize();
        
        menuOfVbox.setMenuVbox();
        
        vBox.getChildren().add(hBox);
        
        gridPaneOfVieuw.setGripPaneOfVieuw();
        
        textFieldVieuw.setTextFeild();
        labelOfVieuw.setLabelOfVieuw();
        
        radioButtonVieuw.setRadioButtonOfVieuw();
        buttonVieuw.setButtonVieuw();
          
        choiceBoxActivity.setItems(
                FXCollections.observableArrayList(this.activity));
        this.gridPaneOfVieuw.getGridPaneInPut().add(choiceBoxActivity, 1, 7);
         
        Scene scene = new Scene(root, 700, 400);
          
        primaryStage.setScene(scene);
        primaryStage.setTitle(" Calcul du BMR ");
        primaryStage.show();
        
    }   
}