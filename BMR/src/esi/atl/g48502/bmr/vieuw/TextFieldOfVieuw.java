
package esi.atl.g48502.bmr.vieuw;

import javafx.scene.control.TextField;

/**
 * the class that represent the all textField of the vieuw
 * @author alistairclerebaut
 */
public class TextFieldOfVieuw {
    
    Vieuw vieuw;
    private TextField textSize ;
    private TextField textWeight ;
    private TextField textAge ;
    private TextField textBmr ;
    private TextField textCalorie ;

    /**
     * create all textField with specific name each
     * @param vieuw the specific vieuw where all textField will be set
     */
    public TextFieldOfVieuw(Vieuw vieuw) {
        this.vieuw = vieuw;
        this.textSize = new TextField();
        this.textWeight = new TextField();
        this.textAge = new TextField();
        this.textBmr = new TextField();
        this.textCalorie = new TextField();
    }
    
    /**
     * method that set all the textField in the specific vieuw
     */
    public void setTextFeild(){
        this.textSize.setPrefColumnCount(15);
        vieuw.getGridPaneOfVieuw().getGridPaneInPut().add(textSize, 1, 2);
        
        
        textWeight.setPrefColumnCount(15);
        vieuw.getGridPaneOfVieuw().getGridPaneInPut().add(textWeight, 1, 3);
        
        
        textAge.setPrefColumnCount(15);
        vieuw.getGridPaneOfVieuw().getGridPaneInPut().add(textAge, 1, 4);
        
        textBmr.setPrefColumnCount(15);
        textCalorie.setPrefColumnCount(15);
        
        vieuw.getGridPaneOfVieuw().getGridPaneOutPut().add(textBmr, 1, 1);
        vieuw.getGridPaneOfVieuw().getGridPaneOutPut().add(textCalorie, 1, 2);
    }


    /**
     * method that make the size textField accessible
     * @return the size textField
     */
    public TextField getTextSize() {
        return textSize;
    }

    /**
     * method that make the wieght textField accessible
     * @return the weight textField of vieuw
     */
    public TextField getTextWeight() {
        return textWeight;
    }

    /**
     * method that make the age textField accessible
     * @return the age textField of vieuw
     */
    public TextField getTextAge() {
        return textAge;
    }

    /**
     * method that make the result bmr textField accessible
     * @return the bmr resut textField of vieuw
     */
    public TextField getTextBmr() {
        return textBmr;
    }

    /**
     * method that make the calorie result textField accessible
     * @return the calorie result textField accessible
     */
    public TextField getTextCalorie() {
        return textCalorie;
    }
}


