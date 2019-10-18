
package esi.atl.g48502.bmr.main;

import esi.atl.g48502.bmr.controler.Controler;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *the main class of the application
 * @author alistairclerebaut
 */
public class Main extends Application{
    
        
    @Override
    public void start(Stage primaryStage) throws Exception {
        Controler controler = new Controler(primaryStage);
        controler.getVieuw().start(primaryStage);
        controler.start(primaryStage);
    }

    
    public static void main(String[] args) {   
        launch();
    }
}
