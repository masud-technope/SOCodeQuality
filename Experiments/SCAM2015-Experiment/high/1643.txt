JFrame frame = new JFrame("FooRendererTest");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.getContentPane().add(mainPanel); // or whatever...
  frame.pack();
  frame.setLocationRelativeTo(null);  // *** this will center your app ***
  frame.setVisible(true);