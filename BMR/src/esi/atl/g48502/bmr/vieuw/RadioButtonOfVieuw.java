
package esi.atl.g48502.bmr.vieuw;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author alistairclerebaut
 */
public class RadioButtonOfVieuw {
    
    private Vieuw vieuw;
    private RadioButton radioButtonHomme;
    private RadioButton radioButtonFemme;
    private ToggleGroup groupRadioButton;
    
    public RadioButtonOfVieuw(Vieuw vieuw){
        this.radioButtonHomme =  new RadioButton("Homme");
        this.radioButtonFemme =  new RadioButton("Femme");
        this.groupRadioButton = new ToggleGroup();
        this.vieuw = vieuw;
    }

    public RadioButton getRadioButtonHomme() {
        return radioButtonHomme;
    }

    public RadioButton getRadioButtonFemme() {
        return radioButtonFemme;
    }

    public ToggleGroup getGroupRadioButton() {
        return groupRadioButton;
    }
    
    public void setRadioButtonOfVieuw(){
        
        radioButtonHomme.setToggleGroup(groupRadioButton);
        radioButtonFemme.setToggleGroup(groupRadioButton);
        
        vieuw.getGridPaneOfVieuw().
                getGridPaneInPut().add(radioButtonHomme, 1, 5);
        vieuw.getGridPaneOfVieuw().
                getGridPaneInPut().add(radioButtonFemme, 1, 6);
        
    }
    
}
