
package esi.atl.g48502.bmr.vieuw;

import javafx.scene.control.Label;

/**
 *the class that represent all label in the vieuw
 * @author alistairclerebaut
 */
public class LabelBmr {
    
    private VieuwBmr vieuw;
    private Label labelInPut;
    private Label labelOutPut;
    private Label labelSize;
    private Label labelWeight;
    private Label labelAge;
    private Label labelGender;
    private Label labelLifeStyle;
    private Label labelBmrResult ;
    private Label labelCalorieResult ;
    
    /**
     * create the labels with specific name of each
     * @param vieuw the specific vieuw where the label will be set
     */
    public LabelBmr(VieuwBmr vieuw){
        this.labelInPut = new Label(" Données ");
        this.labelOutPut =  new Label(" Résultats ");
        this.labelSize = new Label(" Taille (cm) ");
        this.labelWeight = new Label(" Poids (Kg) ");
        this.labelAge  = new Label(" Age (années) ");
        this.labelGender  = new Label(" Sexe ");
        this.labelLifeStyle = new Label(" Style de vie ");
        this.labelBmrResult = new Label(" BMR ");
        this.labelCalorieResult = new Label(" Calories "); 
        this.vieuw = vieuw;
    }

    
    /**
     * method that set all labels in the specific vieuw
     */
    public void setLabelOfVieuw(){
        labelInPut.setUnderline(true);
        labelOutPut.setUnderline(true);
        
        vieuw.getInput().add(labelInPut, 1, 0);
        vieuw.getOutput().add(labelOutPut, 1, 0);
        vieuw.getInput().add(labelSize, 0, 2);
        vieuw.getInput().add(labelWeight, 0, 3);
        vieuw.getInput().add(labelAge, 0, 4);
        vieuw.getInput().add(labelGender, 0, 5);
        vieuw.getInput().add(labelLifeStyle, 0, 7);
        
        vieuw.getOutput().add(labelBmrResult, 0, 1);
        vieuw.getOutput().add(labelCalorieResult, 0, 2);
    }
    
}
