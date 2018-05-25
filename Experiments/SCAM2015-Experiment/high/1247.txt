public void DoEverything() {
  SwingUtilities.invokeLater(new Runnable() {
    public void run() {
      String output = "";
      for(int i = 0; i <= 10; i++) {
        output += TaskObject.someLongTask(i);
        outputText.setText(output);
      }
    }
  });
}