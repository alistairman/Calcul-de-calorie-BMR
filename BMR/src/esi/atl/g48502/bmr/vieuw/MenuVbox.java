package esi.atl.g48502.bmr.vieuw;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 *class that represent the menu bar of vieuw
 * @author alistairclerebaut
 */
public class MenuVbox {
    private MenuBar menuBar;
    private Menu menuFile;
    private MenuItem exit;
    private VieuwBmr vieuw;

    /**
     * create all option of menu wich will be set in the vieuw
     * @param vieuw the specific vieuw where the menu will be set
     */
    MenuVbox(VieuwBmr vieuw) {
        menuBar = new MenuBar();
        menuFile = new Menu("File");
        exit = new MenuItem("Exit");
        this.vieuw = vieuw;
    }

    /**
     * method that make the menu bar accessible
     * @return the menu bar of vieuw
     */
    MenuBar getMenuBar() {
        return menuBar;
    }

    /**
     * method that make the menu file accessible
     * @return the menu file set in the menu bar
     */
    Menu getMenuFile() {
        return menuFile;
    }

    /**
     * method that make the menu file accessible
     * @return the menu item set in the menu file
     */
    MenuItem getExit() {
        return exit;
    }
    
    /**
     * the method that set all the menu in the vieuw
     */
    void setMenuVbox(){
        menuFile.getItems().add(exit);
        menuBar.getMenus().add(menuFile);
        vieuw.vBoxBmr.getChildren().add(menuBar);
    }
}
