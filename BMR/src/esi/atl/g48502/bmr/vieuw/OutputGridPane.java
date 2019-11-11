
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
    
    
    public OutputGridPane(){
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

    public void setTextBmr(String textBmr) {
        
        this.textBmr.setText(textBmr);
    }

    public TextField getTextBmr() {
        return textBmr;
    }

    public TextField getTextCalorie() {
        return textCalorie;
    }
    
    public void setTextCalorie(String textCalorie) {
        this.textCalorie.setText(textCalorie);
    }
    
    public void reset(){
        this.textBmr.clear();
        this.textCalorie.clear();
    }
    
}
