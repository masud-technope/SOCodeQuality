addComponentListener(new ComponentAdapter() {

    @Override
    public void componentResized(ComponentEvent e) {
        setSize(new Dimension(preferredWidth, getHeight()));
        super.componentResized(e);
    }

});