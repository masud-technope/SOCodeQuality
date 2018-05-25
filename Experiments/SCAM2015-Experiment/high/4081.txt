textField.addFocusListener(new FocusAdapter() {
    public void focusGained(FocusEvent e) {
        JTextField source = (JTextField)e.getComponent();
        source.setText("");
        source.removeFocusListener(this);
    }
});