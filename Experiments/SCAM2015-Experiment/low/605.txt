private static String[] returnValues = new String[10]
private static MyDialog dialog;

private MyDialog() {
  initDialog()
}

private void closeDialog()
{
     dispose();
}

private initDialog()
{

 //....
 btnOk = new JButton("OK");
  jTextField1 = new JTextField();
  ...
  jTextField10 = new JTextField();
  ...
  ActionListener btnOK_click = new ActionListener() {

        public void actionPerformed(ActionEvent e)
        {
            returnValues[0] = jTextField1.getText();
            ...
            returnValues[9] = jTextField10.getText();
            closeDialog();  
        }
  }
  btnOk.addActionListener(btnOk_click);
}

public static String[] showMyDialog() {
    dialog = new MyDialog();
    dialog.setVisible(true);
    return returnValues;
}