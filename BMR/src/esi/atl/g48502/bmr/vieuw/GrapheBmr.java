
package esi.atl.g48502.bmr.vieuw;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

/**
 *
 * @author alistairclerebaut
 */
public class GrapheBmr extends LineChart{
    
    private final XYChart.Series seriesHomme;
    private final XYChart.Series seriesFemme;

    public GrapheBmr(Axis xAxis, Axis yAxis) {
        super(xAxis, yAxis);
        
        xAxis.setLabel("Weight");
        yAxis.setLabel("BMR");
        
        seriesHomme = new XYChart.Series();
        seriesHomme.setName("DataHomme");

        seriesFemme = new XYChart.Series();
        seriesFemme.setName("DataFemme");
        setTitle("BMR Index VS Weight");
        getData().addAll(seriesHomme,seriesFemme);
    }

    void addSeriesManLineChart(double x, double y) {
        seriesHomme.getData().add(new XYChart.Data(x, y));
    }

    
    void addSeriesWomanLineChart(double x, double y) {
        seriesFemme.getData().add(new XYChart.Data(x, y));
    }
    
}
