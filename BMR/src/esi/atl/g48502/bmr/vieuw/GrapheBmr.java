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

    void addHommeData(double x, double y) {
        seriesHomme.getData().add(new XYChart.Data(x, y));
    }

    
    void addFemmeData(double x, double y) {
        seriesFemme.getData().add(new XYChart.Data(x, y));
    }
}
