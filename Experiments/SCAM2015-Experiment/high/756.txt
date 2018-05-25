private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    float num1, num2, result;

    try {
        num1 = Float.parseFloat(jTextField1.getText());
        num2 = Float.parseFloat(jTextField2.getText());
        result = num1+num2;
        jTextField3.setText(String.valueOf(result));

    } catch (NumberFormatException e) {
        JOptionPane.showConfirmDialog(null, "Please enter numbers only", "naughty", JOptionPane.CANCEL_OPTION);
    }
}