
package esi.atl.g48502.bmr.vieuw;

import javafx.scene.control.TextField;


public class TextFieldOfVieuw {
    
    Vieuw vieuw;
    private TextField textSize ;
    private TextField textWeight ;
    private TextField textAge ;
    private TextField textBmr ;
    private TextField textCalorie ;

    public TextFieldOfVieuw(Vieuw vieuw) {
        this.vieuw = vieuw;
        this.textSize = new TextField();
        this.textWeight = new TextField();
        this.textAge = new TextField();
        this.textBmr = new TextField();
        this.textCalorie = new TextField();
    }
    
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


    public TextField getTextSize() {
        return textSize;
    }

    public TextField getTextWeight() {
        return textWeight;
    }

    public TextField getTextAge() {
        return textAge;
    }

    public TextField getTextBmr() {
        return textBmr;
    }

    public TextField getTextCalorie() {
        return textCalorie;
    }
    
    

    
}


