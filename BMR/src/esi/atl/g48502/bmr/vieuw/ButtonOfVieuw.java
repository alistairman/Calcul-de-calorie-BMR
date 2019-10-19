
package esi.atl.g48502.bmr.vieuw;

import javafx.geometry.Pos;
import javafx.scene.control.Button;

/**
 *the class that represent and set the button of veiuw
 * @author alistairclerebaut
 */
public class ButtonOfVieuw {
    private Vieuw vieuw;
    private Button buttonBmrCalcul;
    private Button buttonClear;
    
    /**
     * method that create the button with the specific vieuw 
     * @param vieuw the vieuw where the button will be set
     */
    public ButtonOfVieuw(Vieuw vieuw){
        this.buttonBmrCalcul = new Button(" Caclul du BMR ");
        this.buttonClear = new Button("Clear");
        this.vieuw = vieuw;
    }

    /**
     * method that make the calculation button  accessible
     * @return the calculation button  of bmr
     */
    public Button getButtonBmrCalcul() {
        return buttonBmrCalcul;
    }

    /**
     * method that make the clear button accessible
     * @return the clear button
     */
    public Button getButtonClear() {
        return buttonClear;
    }
    
    /**
     * method set the button in the specific vieuw
     */
    public void setButtonVieuw(){
        buttonBmrCalcul.setPrefWidth(700);
        buttonBmrCalcul.setAlignment(Pos.CENTER);
        vieuw.getvBox().getChildren().add(buttonBmrCalcul);
        
        buttonClear.setPrefWidth(700);
        buttonClear.setAlignment(Pos.CENTER);
        vieuw.getvBox().getChildren().add(buttonClear);
    }
    
}
