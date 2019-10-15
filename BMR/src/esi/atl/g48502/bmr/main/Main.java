/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.main;
import esi.atl.g48502.bmr.controler.Controler;
import esi.atl.g48502.bmr.vieuw.Vieuw2;
import static javafx.application.Application.launch;

/**
 *
 * @author alistairclerebaut
 */
public class Main extends Vieuw2{
    
    
    
    public static void main(String[] args) {
        
        Vieuw2 vieuw = new Vieuw2();
        Controler control = new Controler(vieuw);
        launch();
        //control.start();
        
    }

    
     
    
}
