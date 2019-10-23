package kata3;

/**
 *
 * @author J0RG3PD99
 */
public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es"); 
        histogram.increment("google.com"); 
        histogram.increment("ulpgc.es"); 
        histogram.increment("dis.ulpgc.es"); 
        histogram.increment("ulpgc.es");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
