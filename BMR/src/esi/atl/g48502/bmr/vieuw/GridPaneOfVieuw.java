
package esi.atl.g48502.bmr.vieuw;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

/**
 *
 * @author alistairclerebaut
 */
public class GridPaneOfVieuw {
    
    private GridPane gridPaneInPut;
    private GridPane gridPaneOutPut;
    private Vieuw vieuw;
    
    public GridPaneOfVieuw(Vieuw vieuw){
        this.gridPaneInPut = new GridPane();
        this.gridPaneOutPut  = new GridPane();
        this.vieuw = vieuw;
    }
    
    
    public GridPane getGridPaneInPut() {
        return gridPaneInPut;
    }

    public GridPane getGridPaneOutPut() {
        return gridPaneOutPut;
    }
    
    public void setGripPaneOfVieuw(){
        
        gridPaneInPut.setAlignment(Pos.TOP_LEFT);
        gridPaneInPut.setPadding(new Insets(20));
        gridPaneInPut.setHgap(10);
        gridPaneInPut.setVgap(10);
        
        gridPaneOutPut.setAlignment(Pos.BASELINE_RIGHT);
        gridPaneOutPut.setPadding(new Insets(20));
        gridPaneOutPut.setHgap(10);
        gridPaneOutPut.setVgap(10);
        
        this.vieuw.hBox.getChildren().add(gridPaneInPut);
        this.vieuw.hBox.getChildren().add(gridPaneOutPut);
    }
    
}
