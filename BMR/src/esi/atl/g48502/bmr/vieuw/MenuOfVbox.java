/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.vieuw;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;



/**
 *
 * @author alistairclerebaut
 */
public class MenuOfVbox {
    private MenuBar menuBar;
    private Menu menuFile;
    private MenuItem exit;
    private Vieuw vieuw;

    public MenuOfVbox(Vieuw vieuw) {
        this.menuBar = new MenuBar();
        this.menuFile = new Menu("File");
        this.exit = new MenuItem("Exit");
        this.vieuw = vieuw;
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }

    public Menu getMenuFile() {
        return menuFile;
    }

    public MenuItem getExit() {
        return exit;
    }
    
    
    
    public void setMenuVbox(){
        menuFile.getItems().add(exit);
        menuBar.getMenus().add(menuFile);
        this.vieuw.vBox.getChildren().add(menuBar);
    }
    
}
