/**
 * This code was directly taken from: http://www.vogella.com/articles/JFreeChart/article.html
 * All credits goes to him for this code.
 * 
 * Thanks to him.
 */

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class PieChart extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initUI();
            }
        });
    }

    protected static void initUI() {
        // First we create the frame and make it visible
        final PieChart demo = new PieChart("Comparison");
        demo.setSize(500, 270);
        demo.setVisible(true);
        // Then we display the dialog on that frame
        final JDialog dialog = new JDialog(demo);
        dialog.setUndecorated(true);
        JPanel panel = new JPanel();
        final JLabel label = new JLabel("Please wait...");
        panel.add(label);
        dialog.add(panel);
        dialog.pack();
        // Public method to center the dialog after calling pack()
        dialog.setLocationRelativeTo(demo);

        // allowing the frame and the dialog to be displayed and, later, refreshed
        SwingWorker<JFreeChart, String> worker = new SwingWorker<JFreeChart, String>() {

            @Override
            protected JFreeChart doInBackground() throws Exception {
                publish("Loading dataset");
                // simulating the loading of the Dataset
                try {
                    System.out.println("Loading dataset");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // This will create the dataset 
                PieDataset dataset = demo.createDataset();
                publish("Loading JFreeChart");
                // simulating the loading of the JFreeChart
                try {
                    System.out.println("Loading JFreeChart");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // based on the dataset we create the chart
                JFreeChart chart = demo.createChart(dataset, "Which operating system are you using?");
                // we put the chart into a panel
                return chart;
            }

            @Override
            protected void process(List<String> chunks) {
                label.setText(chunks.get(0));
                dialog.pack();
                dialog.setLocationRelativeTo(demo);
                dialog.repaint();
            }

            @Override
            protected void done() {
                try {
                    // Retrieve the created chart and put it in a ChartPanel
                    ChartPanel chartPanel = new ChartPanel(this.get());
                    // add it to our frame
                    demo.setContentPane(chartPanel);
                    // Dispose the dialog.
                    dialog.dispose();
                    // We revalidate to trigger the layout
                    demo.revalidate();
                    // Repaint, just to be sure
                    demo.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        };
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                     worker.execute();
            }
        });
        dialog.setVisible(true);
    }

    public PieChart(String applicationTitle) {
        super(applicationTitle);
    }

    /** * Creates a sample dataset */

    private PieDataset createDataset() {
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Linux", 29);
        result.setValue("Mac", 20);
        result.setValue("Windows", 51);
        return result;

    }

    /** * Creates a chart */

    private JFreeChart createChart(PieDataset dataset, String title) {

        JFreeChart chart = ChartFactory.createPieChart3D(title, // chart title
                dataset, // data
                true, // include legend
                true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;

    }

}