package esi.atl.g48502.bmr.vieuw;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

/**
 *the class that represent the a graphic
 * @author alistairclerebaut
 */
public class GrapheBmr extends LineChart{
    
    private final XYChart.Series seriesHomme;
    private final XYChart.Series seriesFemme;

    /**
     * the method that create the graphic with specific value
     * @param xAxis the value of x axis
     * @param yAxis the value of y axis
     * @param xAxisTitle the value name of x axis
     * @param yAxisTitle the value name of y axis
     * @param grapheTitle the title of the graphic
     */
    GrapheBmr(Axis xAxis, Axis yAxis,String xAxisTitle,String yAxisTitle,
            String grapheTitle) {
        super(xAxis, yAxis);
        setTitle(grapheTitle);
        xAxis.setLabel(xAxisTitle);
        yAxis.setLabel(yAxisTitle);
        
        seriesHomme = new XYChart.Series();
        seriesHomme.setName("DataHomme");

        seriesFemme = new XYChart.Series();
        seriesFemme.setName("DataFemme");
        this.getData().addAll(seriesHomme,seriesFemme);
    }

    /**
     * the method that set the graphic with man values
     * @param x the bmr or calorie of man
     * @param y the weight or height of man
     */
    void addHommeData(double x, double y) {
        seriesHomme.getData().add(new XYChart.Data(x, y));
    }

    /**
     * the method that set the graphic with woman values
     * @param x the bmr or calorie of woman
     * @param y the weight or height of woman
     */
    void addFemmeData(double x, double y) {
        seriesFemme.getData().add(new XYChart.Data(x, y));
    }
}
