scrollPane.getVerticalScrollBar().getModel().addChangeListener(new ChangeListener() {

    @Override
    public void stateChanged(ChangeEvent event) {
        BoundedRangeModel model = (BoundedRangeModel) event.getSource();
        int extent = model.getExtent();
        int maximum = model.getMaximum();
        int value = model.getValue();

        System.out.println("2. Value: " + (value + extent) + " Max: " + maximum);

    }
});