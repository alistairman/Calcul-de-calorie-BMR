
package esi.atl.g48502.bmr.vieuw;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *the class that represent and set the radiobutton is the specific vieuw
 * @author alistairclerebaut
 */
public class RadioButtonOfVieuw {
    
    private Vieuw vieuw;
    private RadioButton radioButtonHomme;
    private RadioButton radioButtonFemme;
    private ToggleGroup groupRadioButton;
    
    /**
     * create all radiobutton for the vieuw
     * @param vieuw the specific vieuw where the radiobutton will be set
     */
    public RadioButtonOfVieuw(Vieuw vieuw){
        this.radioButtonHomme =  new RadioButton("Homme");
        this.radioButtonFemme =  new RadioButton("Femme");
        this.groupRadioButton = new ToggleGroup();
        this.vieuw = vieuw;
    }

    /**
     * method that make the man radiobutton accessible 
     * @return the man radiobutton of vieuw
     */
    public RadioButton getRadioButtonHomme() {
        return radioButtonHomme;
    }

    /**
     * method that make the woman radiobutton accessible
     * @return the woman radiobutton of vieuw
     */
    public RadioButton getRadioButtonFemme() {
        return radioButtonFemme;
    }

    /**
     * method that make the group of those radiobutton accessible
     * @return the group of those radiobutton
     */
    public ToggleGroup getGroupRadioButton() {
        return groupRadioButton;
    }
    
    /**
     * method that set all radiobutton in the specific vieuw
     */
    public void setRadioButtonOfVieuw(){
        
        radioButtonHomme.setToggleGroup(groupRadioButton);
        radioButtonFemme.setToggleGroup(groupRadioButton);
        
        vieuw.getGridPaneOfVieuw().
                getGridPaneInPut().add(radioButtonHomme, 1, 5);
        vieuw.getGridPaneOfVieuw().
                getGridPaneInPut().add(radioButtonFemme, 1, 6);
        
    }
    
}
