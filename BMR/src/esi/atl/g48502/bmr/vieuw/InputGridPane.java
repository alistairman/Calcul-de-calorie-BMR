package esi.atl.g48502.bmr.vieuw;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

/**
 *
 * @author alistairclerebaut
 */
public class InputGridPane extends GridPane {
    
    private TextField textSize ;
    private TextField textWeight ;
    private TextField textAge ;
    private RadioButton radioButtonHomme;
    private RadioButton radioButtonFemme;
    private ToggleGroup groupRadioButton;
    
    InputGridPane(){
        this.setAlignment(Pos.TOP_LEFT);
        this.setPadding(new Insets(20));
        this.setHgap(10);
        this.setVgap(10);
        
        textSize = new TextField();
        textWeight = new TextField();
        textAge = new TextField();
        radioButtonHomme =  new RadioButton("Homme");
        radioButtonFemme =  new RadioButton("Femme");
        groupRadioButton = new ToggleGroup();
        
        textSize.setPrefColumnCount(15);
        this.add(textSize, 1, 2);
        
        textWeight.setPrefColumnCount(15);
        this.add(textWeight, 1, 3);
        
        textAge.setPrefColumnCount(15);
        this.add(textAge, 1, 4);
        
        radioButtonHomme.setToggleGroup(groupRadioButton);
        radioButtonFemme.setToggleGroup(groupRadioButton);
        
        this.add(radioButtonHomme, 1, 5);
        this.add(radioButtonFemme, 1, 6);
    }

    TextField getTextSize() {
        return textSize;
    }

    TextField getTextWeight() {
        return textWeight;
    }

    TextField getTextAge() {
        return textAge;
    }

    public double getSize() {
        return Double.parseDouble(textSize.getText());
    }

    public double getWeight() {
        return Double.parseDouble(textWeight.getText());
    }

    public int getAge() {
        return Integer.parseInt(textAge.getText());
    }
    
    /**
     * method that make the man radiobutton accessible 
     * @return the man radiobutton of vieuw
     */
    RadioButton getRadioButtonHomme() {
        return radioButtonHomme;
    }

    /**
     * method that make the woman radiobutton accessible
     * @return the woman radiobutton of vieuw
     */
    RadioButton getRadioButtonFemme() {
        return radioButtonFemme;
    }

    /**
     * method that make the group of those radiobutton accessible
     * @return the group of those radiobutton
     */
    ToggleGroup getGroupRadioButton() {
        return groupRadioButton;
    }
    
    public void reset(){
        this.textAge.clear();
        this.textSize.clear();
        this.textWeight.clear();
    }
}
