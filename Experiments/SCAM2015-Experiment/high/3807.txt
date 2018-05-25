Timer timer = new Timer(1000, new ActionListener(){
    private int count = 100;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (count == 0) {
            ((Timer)e.getSource).stop();
        } else {
            // decrement the count and set the text for the label
        }
    }
});
// start the timer with a call to timer.start()