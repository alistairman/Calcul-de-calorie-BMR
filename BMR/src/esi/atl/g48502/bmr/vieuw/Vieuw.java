/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.vieuw;

import esi.atl.g48502.bmr.controler.Controler;
import javafx.scene.control.Button;

public class Vieuw extends Controler {
    
    public Vieuw(){
        Vieuw aThis = this;
    }
    
    public void println(String string){
        System.out.println(string);
    }
    
    
    public void setTextButton(Button button,String string){
        button.setText(string);
    }
    
    
   
}
