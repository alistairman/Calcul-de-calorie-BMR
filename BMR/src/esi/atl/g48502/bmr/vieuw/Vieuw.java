/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.vieuw;

import esi.atl.g48502.bmr.controler.Controler;
import esi.atl.g48502.bmr.model.Model_Bmr;
import javafx.scene.control.Button;
import javafx.scene.control.Label;



public class Vieuw extends Controler {
    
    private final Model_Bmr model;
    
    public Vieuw(Model_Bmr model){
        this.model = model;
    }
    
    public void println(String string){
        System.out.println(string);
    }
    
    
    public void setTextButton(Button button,String string){
        button.setText(string);
    }
    
    public Label label(String string){
        return model.newLabel(string);
    }
    
   
}
