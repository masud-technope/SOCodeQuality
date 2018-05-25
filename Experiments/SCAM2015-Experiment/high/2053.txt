scrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {

    @Override
    public void adjustmentValueChanged(AdjustmentEvent event) {
        JScrollBar scrollBar = (JScrollBar) event.getAdjustable();
        int extent = scrollBar.getModel().getExtent();
        System.out.println("1. Value: " + (scrollBar.getValue() + extent) + " Max: " + scrollBar.getMaximum());

    }
});