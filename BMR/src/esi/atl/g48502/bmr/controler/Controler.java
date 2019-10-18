
package esi.atl.g48502.bmr.controler;

import esi.atl.g48502.bmr.model.Activities;
import esi.atl.g48502.bmr.model.Femme;
import esi.atl.g48502.bmr.model.Homme;
import esi.atl.g48502.bmr.vieuw.Vieuw;
import static java.lang.Integer.parseInt;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *the class that represent the users interface
 * @author alistairclerebaut
 */
public class Controler{
    
    
    
    private Homme homme;
    private Femme femme;
    private final Vieuw vieuw;
    private Stage primaryStage;
    
    
    /**
     * create the interface with initial components
     * @param primaryStage
     */
    public Controler(Stage primaryStage){
        this.vieuw = new Vieuw(primaryStage);
    }

    public Vieuw getVieuw() {
        return vieuw;
    }

    
    
    /**
     * the method that select the value of activity choised 
     * @param act the activity choised 
     * @return the velue of the activity
     */
    public double act(Activities act){
        double nb=0;
        switch(act){
            case SEDENTAIRE: nb=1.2; break;
            case PEU_ACTIF : nb=1.375; break;
            case ACTIF: nb=1.55; break;
            case FORT_ACTIF : nb=1.725; break;
            case EXTREME_ACTIF: nb=1.9; break;
            default : nb=0;

        }
        return nb;
    }

    /**
     * the method that set the fonctionality of the user interface
     * @param primaryStage the stage where the interface is set
     */
    public void start(Stage primaryStage) {
        
        vieuw.getButtonVieuw().getButtonBmrCalcul().
                setOnAction((ActionEvent e) -> {
            if(vieuw.getTextFieldVieuw().getTextSize().getText().isEmpty() || 
                    vieuw.getTextFieldVieuw().getTextWeight().
                            getText().isEmpty() || 
                    vieuw.getTextFieldVieuw().getTextAge().getText().isEmpty()){
                System.out.println( "\033[31m"+" marche pas");
                
                vieuw.getTextFieldVieuw().getTextBmr().setText(" Failed! ");
                vieuw.getTextFieldVieuw().getTextBmr().
                        setStyle("-fx-text-fill:red");
                vieuw.getTextFieldVieuw().getTextCalorie().setText(" Failed! ");
                vieuw.getTextFieldVieuw().getTextCalorie().
                        setStyle("-fx-text-fill:red");
            }
            
            else if(vieuw.getRadioButtonVieuw().
                    getGroupRadioButton().getSelectedToggle()==
                    vieuw.getRadioButtonVieuw().getRadioButtonHomme()){
                
                double poids = parseInt(vieuw.getTextFieldVieuw().
                        getTextSize().getText());
                double taille = parseInt(vieuw.getTextFieldVieuw().
                        getTextWeight().getText());
                double age = parseInt(vieuw.getTextFieldVieuw().
                        getTextAge().getText());
                homme = new Homme (poids,taille,age);
            
                vieuw.getTextFieldVieuw().getTextBmr().
                        setText(Integer.toString(homme.bmr()));
                vieuw.getTextFieldVieuw().getTextCalorie().
                        setText(Integer.toString(
                        homme.calorie(act((Activities)
                                vieuw.getChoiceBoxActivity().getValue()))));
            
                }
            
            else if(vieuw.getRadioButtonVieuw().getGroupRadioButton().
                    getSelectedToggle()==
                    vieuw.getRadioButtonVieuw().getRadioButtonFemme()){
                
                double poids = parseInt(vieuw.getTextFieldVieuw().
                        getTextSize().getText());
                double taille = parseInt(vieuw.getTextFieldVieuw().
                        getTextWeight().getText());
                double age = parseInt(vieuw.getTextFieldVieuw().
                        getTextAge().getText());
                femme = new Femme(poids,taille,age);
                
                vieuw.getTextFieldVieuw().getTextBmr().
                        setText(Integer.toString(femme.bmr()));
                vieuw.getTextFieldVieuw().getTextCalorie().
                        setText(Integer.toString(
                        femme.calorie(act((Activities)
                                vieuw.getChoiceBoxActivity().getValue()))));
                }
            
        });
        
        vieuw.getButtonVieuw().getButtonClear().setOnAction((ActionEvent e)->{
            clearTextField(vieuw.getTextFieldVieuw().getTextSize());
            clearTextField(vieuw.getTextFieldVieuw().getTextWeight());
            clearTextField(vieuw.getTextFieldVieuw().getTextAge());;
            clearTextField(vieuw.getTextFieldVieuw().getTextBmr());
            clearTextField(vieuw.getTextFieldVieuw().getTextCalorie());
        });
        
        vieuw.getTextFieldVieuw().getTextWeight().addEventFilter(
                KeyEvent.KEY_TYPED , new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                invalidInput(e);
            }
        });
        
        
        vieuw.getTextFieldVieuw().getTextSize().addEventFilter(
                KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                invalidInput(e);
                
            }
        });
        
        vieuw.getTextFieldVieuw().getTextAge().addEventFilter(
                KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                inputOnlyNumber(e);
                invalidInput(e);
            }
        });
        
        vieuw.getMenuOfVbox().getExit().addEventHandler(ActionEvent.ACTION, 
                new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent event){
               System.exit(0);
           } 
        });        
    }

    
    private void clearTextField(TextField text) {
        text.clear();
    }
    
    private void inputOnlyNumber(KeyEvent e) {
        if (e.getCharacter().matches("[^0-9]")){
            e.consume();
        }
    }

    private void invalidInput(KeyEvent e) {
        if (e.getCharacter().matches("[-0]")){
            Alert error = new Alert(Alert.AlertType.ERROR,
                    "WARNING",ButtonType.CLOSE);
            error.showAndWait();
        }
    }
}

    
    

