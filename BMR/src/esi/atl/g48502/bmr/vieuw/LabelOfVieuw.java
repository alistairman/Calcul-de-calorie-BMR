/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.vieuw;

import javafx.scene.control.Label;

/**
 *
 * @author alistairclerebaut
 */
public class LabelOfVieuw {
    
    private Vieuw vieuw;
    private Label labelInPut;
    private Label labelOutPut;
    private Label labelSize;
    private Label labelWeight;
    private Label labelAge;
    private Label labelGender;
    private Label labelLifeStyle;
    private Label labelBmrResult ;
    private Label labelCalorieResult ;
    
    
    public LabelOfVieuw(Vieuw vieuw){
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

    
    
    public void setLabelOfVieuw(){
        labelInPut.setUnderline(true);
        labelOutPut.setUnderline(true);
        
        vieuw.getGridPaneOfVieuw().getGridPaneInPut().add(labelInPut, 1, 0);
        vieuw.getGridPaneOfVieuw().getGridPaneOutPut().add(labelOutPut, 1, 0);
        vieuw.getGridPaneOfVieuw().getGridPaneInPut().add(labelSize, 0, 2);
        vieuw.getGridPaneOfVieuw().getGridPaneInPut().add(labelWeight, 0, 3);
        vieuw.getGridPaneOfVieuw().getGridPaneInPut().add(labelAge, 0, 4);
        vieuw.getGridPaneOfVieuw().getGridPaneInPut().add(labelGender, 0, 5);
        vieuw.getGridPaneOfVieuw().getGridPaneInPut().add(labelLifeStyle, 0, 7);
        
        vieuw.getGridPaneOfVieuw().
                getGridPaneOutPut().add(labelBmrResult, 0, 1);
        vieuw.getGridPaneOfVieuw().
                getGridPaneOutPut().add(labelCalorieResult, 0, 2);
    }
    
}
