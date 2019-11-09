
package esi.atl.g48502.bmr.vieuw;


import esi.atl.g48502.bmr.model.Activities;
import esi.atl.g48502.bmr.model.Personne;
import esi.atl.g48502.bmr.util.Observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * the class that represente a structure of the user interface
 * @author alistairclerebaut
 */
public class VieuwBmr {
    
    private Stage primaryStage;
    private BorderPane root;
    
    private MenuVbox menuOfVbox;
    
    protected VBox vBox;
    protected HBox hBox;
    
    private InputGridPane input;
    
    private OutputGridPane output;
    
    
    private LabelBmr labelOfVieuw;
    
    
    private ChoiceBox choiceBoxActivity ;
    
    private ButtonHbox buttonVieuw;
    
    private List<Activities> activity;
    

    /**
     * create the vieuw of the application 
     * @param primaryStage where the vieuw will be set
     */
    public VieuwBmr(Stage primaryStage) {
        
        this.primaryStage = primaryStage;
        this.root = new BorderPane();
        
        this.vBox = new VBox(12);
        this.hBox= new HBox();
        
        this.menuOfVbox = new MenuVbox(this);
        
        this.input = new InputGridPane();
        this.output = new OutputGridPane();
        
        
        this.labelOfVieuw = new LabelBmr(this);
        this.buttonVieuw = new ButtonHbox(this);
        
        this.choiceBoxActivity = new ChoiceBox();
        
        this.activity = new ArrayList<>();
        activity.addAll(Arrays.asList(Activities.values()));
        
    }

    /**
     * method that make the class of button accessible
     * @return the buttons on class
     */
    public ButtonHbox getButtonVieuw() {
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
    public MenuVbox getMenuOfVbox() {
        return menuOfVbox;
    }

    /**
     * method that make the gridpane of interface accessible
     * @return the gridpanes from the user interface
     */
    public InputGridPane getInput() {
        return input;
    }

    public OutputGridPane getOutput() {
        return output;
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
        
        hBox.getChildren().add(input);
        hBox.getChildren().add(output);
        
        menuOfVbox.setMenuVbox();
        
        vBox.getChildren().add(hBox);
        
        
        labelOfVieuw.setLabelOfVieuw();
        
        buttonVieuw.setButtonVieuw();
          
        choiceBoxActivity.setItems(
                FXCollections.observableArrayList(this.activity));
        this.input.add(choiceBoxActivity, 1, 7);
        
        menuOfVbox.getExit().addEventHandler(ActionEvent.ACTION, 
                new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent event){
               System.exit(0);
           } 
        });
        
        input.getTextWeight().addEventFilter(
                KeyEvent.KEY_TYPED , new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                invalidInput(e);
            }
        });
        
        input.getTextSize().addEventFilter(
                KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                invalidInput(e);
                
            }
        });
        
        input.getTextAge().addEventFilter(
                KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                invalidInput(e);
            }
        });
        
        
         
        Scene scene = new Scene(root, 700, 400);
          
        primaryStage.setScene(scene);
        primaryStage.setTitle(" Calcul du BMR ");
        primaryStage.show();
    }   

    public Activities getActivity(){
        return (Activities)choiceBoxActivity.getValue();
    }
    
    /**
     * method that consume the event key typed when it was a charactere
     * @param e event key typed
     */
    public void inputOnlyNumber(KeyEvent e) {
        if (e.getCharacter().matches("[^0-9]")){
            e.consume();
        }
    }
    
    /**
     * method that show a warning alert when the negatif number was typeed
     * @param e event key typed
     */
    public void invalidInput(KeyEvent e) {
        if (e.getCharacter().matches("[-0]")){
            Alert error = new Alert(Alert.AlertType.ERROR,
                    "WARNING",ButtonType.CLOSE);
            error.showAndWait();
        }
    }
    
}