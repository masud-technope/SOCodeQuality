// Inside the initializeComponents() method 
// Find and replace 
chartPanel = new JPanel(); 
// By 
chartPanel = createChartPanel();

// Create chart panel method
public JPanel createChartPanel(){
    DefaultPieDataset pieDataset = new DefaultPieDataset();
    pieDataset.setValue("One", new Integer(10));
    pieDataset.setValue("Two", new Integer(20));
    pieDataset.setValue("Three", new Integer(30));
    pieDataset.setValue("Four", new Integer(10));
    pieDataset.setValue("Five", new Integer(20));
    pieDataset.setValue("Six", new Integer(10));
    JFreeChart chart = ChartFactory.createPieChart3D("3D Pie Chart", pieDataset, true, true, true);
    return new ChartPanel(chart);
}