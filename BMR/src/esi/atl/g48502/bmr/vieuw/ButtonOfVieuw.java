
package esi.atl.g48502.bmr.vieuw;

import javafx.geometry.Pos;
import javafx.scene.control.Button;

/**
 *
 * @author alistairclerebaut
 */
public class ButtonOfVieuw {
    private Vieuw vieuw;
    private Button buttonBmrCalcul;
    private Button buttonClear;
    
    public ButtonOfVieuw(Vieuw vieuw){
        this.buttonBmrCalcul = new Button(" Caclul du BMR ");
        this.buttonClear = new Button("Clear");
        this.vieuw = vieuw;
    }

    public Button getButtonBmrCalcul() {
        return buttonBmrCalcul;
    }

    public Button getButtonClear() {
        return buttonClear;
    }
    
    public void setButtonVieuw(){
        buttonBmrCalcul.setPrefWidth(700);
        buttonBmrCalcul.setAlignment(Pos.CENTER);
        vieuw.getvBox().getChildren().add(buttonBmrCalcul);
        
        buttonClear.setPrefWidth(700);
        buttonClear.setAlignment(Pos.CENTER);
        vieuw.getvBox().getChildren().add(buttonClear);
    }
    
}
