package esi.atl.g48502.bmr.vieuw;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author alistairclerebaut
 */
public class OutputGridPane extends GridPane{
    
    private TextField textBmr ;
    private TextField textCalorie ;
    
    /**
     * the method that create and set the output field of bmr
     */
    OutputGridPane(){
        this.setAlignment(Pos.BASELINE_RIGHT);
        this.setPadding(new Insets(20));
        this.setHgap(10);
        this.setVgap(10);
        
        textBmr = new TextField();
        textCalorie = new TextField();
        
        textBmr.setPrefColumnCount(15);
        textCalorie.setPrefColumnCount(15);
        
        this.add(textBmr, 1, 1);
        this.add(textCalorie, 1, 2);

    }

    /**
     * the method that change the value of the bmr field
     * @param textBmr the new value of bmr field
     */
    public void setTextBmr(String textBmr) {
        this.textBmr.setText(textBmr);
    }

    /**
     * the method that make the bmr field accessible 
     * @return the bmr field
     */
    TextField getTextBmr() {
        return textBmr;
    }

    /**
     * the method that make the calorie field accessible
     * @return the calorie field
     */
    TextField getTextCalorie() {
        return textCalorie;
    }
    
    /**
     * the method that change the value of the calorie field
     * @param textCalorie the new value of calorie field
     */
    public void setTextCalorie(String textCalorie) {
        this.textCalorie.setText(textCalorie);
    }
    
    /**
     * the method that clear all output fields
     */
    public void reset(){
        this.textBmr.clear();
        this.textCalorie.clear();
    }
}
