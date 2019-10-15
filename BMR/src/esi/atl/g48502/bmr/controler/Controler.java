/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.controler;

import esi.atl.g48502.bmr.model.Activities;
import esi.atl.g48502.bmr.vieuw.Vieuw2;
import java.util.Arrays;
import java.util.List;
import javafx.event.ActionEvent;
/**
 *
 * @author alistairclerebaut
 */
public class Controler {
    
    private Vieuw2 vieuw;
    
    public Controler(Vieuw2 vieuw) {
        this.vieuw = new Vieuw2();
    }
    
    public void start(){
        
        vieuw.getButton().setOnAction((ActionEvent e) -> {
            if(vieuw.getText1().getText().isEmpty()){
                System.out.println(" marche pas");
            }
        });
        
    }
    
    

    
    
}
