package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    private Histogram<String> histogram;
    
    public HistogramDisplay(Histogram<String> histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();
    }
    
    public void execute() {
        setVisible(true);
    }
    
    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataSet()));
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", 
                                                        "Dominio emails", 
                                                        "Nº de emails", dataSet, 
                                                        PlotOrientation.VERTICAL, 
                                                        false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (String key : this.histogram.keySet()) {
            dataSet.addValue(this.histogram.get(key),"",key);
        }
        /*
        dataSet.addValue(300,"","ulpgc.es");
        dataSet.addValue(100,"","dis.ulpgc.es");
        dataSet.addValue(500,"","gmail.com");
        */
        return dataSet;
    }
    
}
