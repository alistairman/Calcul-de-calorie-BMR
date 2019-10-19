package esi.atl.g48502.bmr.main;

import esi.atl.g48502.bmr.controler.Controler;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *the main class of the application
 * the class that launch the application
 * @author alistairclerebaut
 */
public class Main extends Application{
    
     
    /**
     * the method that set the application
     * @param primaryStage
     * @throws Exception 
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Controler controler = new Controler(primaryStage);
        controler.getVieuw().start(primaryStage);
        controler.start(primaryStage);
    }

    /**
     * we launch the application here
     * @param args the diferent arguments of command line
     */
    public static void main(String[] args) {   
        launch();
    }
}
