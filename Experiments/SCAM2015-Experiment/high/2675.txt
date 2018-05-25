yourJTextField.getDocument().addDocumentListener(new DocumentListener() {
  public void changedUpdate(DocumentEvent e) {
    changed();
  }
  public void removeUpdate(DocumentEvent e) {
    changed();
  }
  public void insertUpdate(DocumentEvent e) {
    changed();
  }

  public void changed() {
     if (yourJTextField.getText().equals("")){
       loginButton.setEnabled(false);
     }
     else {
       loginButton.setEnabled(true);
    }

  }
});