package esi.atl.g48502.bmr.vieuw;

import esi.atl.g48502.bmr.model.Activities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * the class that represente a structure of the user interface
 * @author alistairclerebaut
 */
public class VieuwBmr {
    
    private BorderPane root;
    private MenuVbox menuOfVbox;
    protected HBox hBoxRoot;
    protected VBox vBoxBmr;
    protected HBox hBoxGraphic;
    protected HBox hBoxData;
    protected TabGraphe graphic;
    private InputGridPane input;
    private OutputGridPane output;
    private LabelBmr labelOfVieuw;
    private ChoiceBox choiceBoxActivity ;
    private ButtonHbox buttonVieuw;
    private List<Activities> activity;
    
    /**
     * create the vieuw of the bmr application 
     */
    public VieuwBmr() {
        root = new BorderPane();
        hBoxRoot = new HBox();
        hBoxGraphic = new HBox();
        vBoxBmr = new VBox(12);
        hBoxData= new HBox();
        graphic = new TabGraphe();
        menuOfVbox = new MenuVbox(this);
        input = new InputGridPane();
        output = new OutputGridPane();
        labelOfVieuw = new LabelBmr(this);
        buttonVieuw = new ButtonHbox(this);
        choiceBoxActivity = new ChoiceBox();
        activity = new ArrayList<>();
        activity.addAll(Arrays.asList(Activities.values()));
    }

    /**
     * the method that make the graphic tab accessible
     * @return the graphic tab
     */
    public TabGraphe getGraphic() {
        return graphic;
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
    VBox getvBox() {
        return vBoxBmr;
    }
   
    /**
     * method that make the input gridpane of interface accessible
     * @return the input gridpanes from the user interface
     */
    public InputGridPane getInput() {
        return input;
    }

    /**
     * method that make the output gridpane of interface accessible
     * @return the output gridpanes from the user interface
     */
    public OutputGridPane getOutput() {
        return output;
    }
    
    /**
     * method that set all components of the user interface
     * and show and set the primaryStage
     * @param primaryStage the stage where the component will be set
     *
     */
    public void start(Stage primaryStage) {
        root.setCenter(hBoxRoot);
        hBoxGraphic.setAlignment(Pos.CENTER);
        hBoxGraphic.autosize();
        hBoxGraphic.setBackground(new Background(new BackgroundFill
        (Color.rgb(147, 150, 171), CornerRadii.EMPTY, Insets.EMPTY)));
        
        hBoxGraphic.getChildren().add(graphic);
        hBoxData.setAlignment(Pos.CENTER);
        hBoxData.autosize();
        menuOfVbox.setMenuVbox();
        hBoxData.getChildren().add(input);
        hBoxData.getChildren().add(output);
        vBoxBmr.getChildren().add(hBoxData);
        hBoxRoot.getChildren().add(vBoxBmr);
        hBoxRoot.getChildren().add(hBoxGraphic);
        labelOfVieuw.setLabelOfVieuw();
        buttonVieuw.setButtonVieuw();
          
        choiceBoxActivity.setItems(
                FXCollections.observableArrayList(this.activity));
        input.add(choiceBoxActivity, 1, 7);
        
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
                //invalidInput(input.getTextWeight());
            }
        });
        
        input.getTextSize().addEventFilter(
                KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                //invalidInput(input.getTextSize());
                
            }
        });
        
        input.getTextAge().addEventFilter(
                KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                //invalidInput(input.getTextAge());
            }
        });
        
        Scene scene = new Scene(root, 1200, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle(" Calcul du BMR ");
        primaryStage.show();
    }   

    /**
     * the method that get the value of activity selected
     * @return the value of activity selected
     */
    public Activities getActivity(){
        return (Activities)choiceBoxActivity.getValue();
    }
    
    /**
     * the method that check if the man radiobutton is selected
     * @return true if the man radioButton is selected
     */
    public boolean isHommeSelected(){
        return input.getGroupRadioButton().getSelectedToggle()==
                    input.getRadioButtonHomme();
    }
    
    /**
     * the method that check if the woman radiobutton is selected
     * @return true if the woman radioButton is selected
     */
    public boolean isFemmeSelected(){
        return input.getGroupRadioButton().getSelectedToggle()==
                    input.getRadioButtonFemme();
    }
    
    /**
     * the method that check if all textfield is empty
     * @return true if one of textField is empty
     */
    public boolean isEmptyInput(){
        return input.getTextSize().getText().isEmpty() || input.getTextWeight().
            getText().isEmpty() || input.getTextAge().getText().isEmpty();
    }
    
    /**
     * the method called and show a message if one of textField is empty
     */
    public void invalidInput(){
        output.setTextBmr(" Failed! ");
        output.getTextBmr().setStyle("-fx-text-fill:red");
        output.setTextCalorie(" Failed! ");
        output.getTextCalorie().setStyle("-fx-text-fill:red");
    }
    
    /**
     * method that consume the event key typed when it was a charactere
     * @param e event key typed
     */
    void inputOnlyNumber(KeyEvent e) {
        if (e.getCharacter().matches("[^0-9]")){
            e.consume();
        }
    }
    
    /**
     * method that show a warning alert when the negatif number was typeed
     * 
     */
    public boolean zeroInput() {
        return input.getSize()<=0 || input.getWeight()<=0 || input.getAge()<=0;
    }
}