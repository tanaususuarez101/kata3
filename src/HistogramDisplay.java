import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import javax.swing.*;
import java.awt.*;

import java.util.*;

public class HistogramDisplay extends ApplicationFrame {
    public HistogramDisplay() {
        super("HISTOGRAMA");
        this.setContentPane(createPanel());
        this.pack();
    }
    public void execute(){
        this.setVisible(true);
    }
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return  chartPanel;

    }
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        return ChartFactory.createBarChart(
                "Histograma JFreeChart",
                "Dominios email",
                "Nº de emails",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false
        );
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(7,"","gmail");
        dataSet.addValue(3,"","ulpgc.es");
        dataSet.addValue(5,"","ull.es");
        dataSet.addValue(1,"","hotmail.com");
        return dataSet;
    }

}
