
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
     * create the vieuw of the application 
     * @param primaryStage where the vieuw will be set
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

    /**
     * method that make the class of button accessible
     * @return the buttons on class
     */
    public ButtonOfVieuw getButtonVieuw() {
        return buttonVieuw;
    }
    
    /**
     * method that make the VBox of vieuw interface accessible
     * @return the VBox of the user interface
     */
    public VBox getvBox() {
        return vBox;
    }
    
    /**
     * method that make class of radioButton of the interface accessible
     * @return the radiobuttons of the user interface 
     */
    public RadioButtonOfVieuw getRadioButtonVieuw() {
        return radioButtonVieuw;
    }

    /**
     * method that make the class of textField of interface accessible
     * @return all textField of user interface
     */
    public TextFieldOfVieuw getTextFieldVieuw() {
        return textFieldVieuw;
    }
   
    /**
     * method that make the choiceBox accessible
     * @return the choicebox from the user interface
     */
    public ChoiceBox getChoiceBoxActivity() {
        return choiceBoxActivity;
    }

    /**
     * method that make the menubar of interface accessible
     * @return the menus from the user interface
     */
    public MenuOfVbox getMenuOfVbox() {
        return menuOfVbox;
    }

    /**
     * method that make the gridpane of interface accessible
     * @return the gridpanes from the user interface
     */
    public GridPaneOfVieuw getGridPaneOfVieuw() {
        return gridPaneOfVieuw;
    }
    
    
    /**
     * method that set all components of the user interface
     * and show the primaryStage
     * @param primaryStage the stage where the component will be set
     *
     */
    public void start(Stage primaryStage) {
        
        root.setCenter(vBox);
        
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