
package esi.atl.g48502.bmr.vieuw;


import esi.atl.g48502.bmr.model.Activities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
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
    
    protected MenuBar menuBar;
    protected Menu menuFile;
    protected MenuItem exit;
    
    protected List<Activities> activity;
    protected TextField textSize ;
    protected TextField textWeight ;
    protected TextField textAge ;
    protected TextField textBmr ;
    protected TextField textCalorie ;

    protected BorderPane root;
    protected VBox vBox;
    protected HBox hBox;
    protected GridPane gridPaneInPut;
    protected GridPane gridPaneOutPut;
    protected Label labelInPut;
    protected Label labelOutPut;
    protected Label labelSize;
    protected Label labelWeight;
    protected Label labelAge;
    protected Label labelGender;
    protected Label labelLifeStyle;
    
    protected RadioButton radioButtonHomme;
    protected RadioButton radioButtonFemme;
    
    protected ChoiceBox choiceBoxActivity ;
    
    protected Label labelBmrResult ;
    protected Label labelCalorieResult ;
    
    protected Button buttonBmrCalcul;
    protected Button buttonClear;
    
    protected ToggleGroup groupRadioButton;

    /**
     * the method that create the interface of user
     */
    public Vieuw() {
        
        this.activity = new ArrayList<>();
        activity.addAll(Arrays.asList(Activities.values()));
        
        this.textSize = new TextField();
        this.textWeight = new TextField();
        this.textAge = new TextField();
        this.textBmr = new TextField();
        this.textCalorie = new TextField();
        this.root = new BorderPane();
        this.vBox = new VBox(12);
        this.hBox= new HBox();
        this.gridPaneInPut = new GridPane();
        this.gridPaneOutPut  = new GridPane();
        this.labelInPut = new Label(" Données ");
        this.labelOutPut =  new Label(" Résultats ");
        this.labelSize = new Label(" Taille (cm) ");
        this.labelWeight = new Label(" Poids (Kg) ");
        this.labelAge  = new Label(" Age (années) ");
        this.labelGender  = new Label(" Sexe ");
        this.labelLifeStyle = new Label(" Style de vie ");
        
        this.radioButtonHomme =  new RadioButton("Homme");
        this.radioButtonFemme =  new RadioButton("Femme");
        
        this.choiceBoxActivity = new ChoiceBox();
        
        this.labelBmrResult = new Label(" BMR ");
        this.labelCalorieResult = new Label(" Calories "); 
        
        this.buttonBmrCalcul = new Button(" Caclul du BMR ");
        this.buttonClear = new Button("Clear");
        
        this.groupRadioButton = new ToggleGroup();
        
        this.menuBar = new MenuBar();
        this.menuFile = new Menu("File");
        this.exit = new MenuItem("Exit");
        
        
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        vBox.setVisible(true);
        root.setCenter(vBox);
        
        
        hBox.setVisible(true);
        hBox.setAlignment(Pos.CENTER);
        hBox.autosize();
        
        menuFile.getItems().add(exit);
        menuBar.getMenus().add(menuFile);
        vBox.getChildren().add(menuBar);
        
        vBox.getChildren().add(hBox);
        
        gridPaneInPut.setAlignment(Pos.TOP_LEFT);
        gridPaneInPut.setPadding(new Insets(30));
        gridPaneInPut.setHgap(10);
        gridPaneInPut.setVgap(10);
        
        gridPaneOutPut.setAlignment(Pos.BASELINE_RIGHT);
        gridPaneOutPut.setPadding(new Insets(30));
        gridPaneOutPut.setHgap(10);
        gridPaneOutPut.setVgap(10);
        
        hBox.getChildren().add(gridPaneInPut);
        hBox.getChildren().add(gridPaneOutPut);
        
        labelInPut.setUnderline(true);
        labelOutPut.setUnderline(true);

        gridPaneInPut.add(labelInPut, 1, 0);
        gridPaneOutPut.add(labelOutPut, 1, 0);
        gridPaneInPut.add(labelSize, 0, 2);
        gridPaneInPut.add(labelWeight, 0, 3);
        gridPaneInPut.add(labelAge, 0, 4);
        gridPaneInPut.add(labelGender, 0, 5);
        gridPaneInPut.add(labelLifeStyle, 0, 7);
        
        textSize.setPrefColumnCount(15);
        gridPaneInPut.add(textSize, 1, 2);
        
        
        textSize.setPrefColumnCount(15);
        gridPaneInPut.add(textWeight, 1, 3);
        
        
        textSize.setPrefColumnCount(15);
        gridPaneInPut.add(textAge, 1, 4);
        
        gridPaneInPut.add(radioButtonHomme, 1, 5);
        gridPaneInPut.add(radioButtonFemme, 1, 6);

        choiceBoxActivity.setItems(FXCollections.observableArrayList(this.activity));
        gridPaneInPut.add(choiceBoxActivity, 1, 7);
        
        gridPaneOutPut.add(labelBmrResult, 0, 1);
        gridPaneOutPut.add(labelCalorieResult, 0, 2);
        
        textSize.setPrefColumnCount(15);
        gridPaneOutPut.add(textBmr, 1, 1);
        gridPaneOutPut.add(textCalorie, 1, 2);
        
        
        buttonBmrCalcul.setPrefWidth(700);
        buttonBmrCalcul.setAlignment(Pos.CENTER);
        vBox.getChildren().add(buttonBmrCalcul);
        
        buttonClear.setPrefWidth(700);
        buttonClear.setAlignment(Pos.CENTER);
        vBox.getChildren().add(buttonClear);
        
        this.radioButtonHomme.setToggleGroup(groupRadioButton);
        this.radioButtonFemme.setToggleGroup(groupRadioButton);
        
        textSize.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                invalidInput(e);
                
            }
        });
        
        textWeight.addEventFilter(KeyEvent.KEY_TYPED , new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                invalidInput(e);
            }
        });
        
        textAge.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                invalidInput(e);
            }
        });
        
        exit.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent event){
               System.exit(0);
           } 
        });
        
        
        
        
        Scene scene = new Scene(root, 700, 400);
        
        primaryStage.setTitle(" Calcul du BMR ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void inputOnlyNumber(KeyEvent e) {
        if (e.getCharacter().matches("[^0-9]")){
            e.consume();
        }
    }

    private void invalidInput(KeyEvent e) {
        if (e.getCharacter().matches("[-0]")){
            Alert error = new Alert(AlertType.ERROR,"WARNING",ButtonType.CLOSE);
            error.showAndWait();
        }
    }
    
    
    
}
