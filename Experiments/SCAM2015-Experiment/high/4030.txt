JButton button = new JButton("1");
JButton button2 = new JButton("2");
JButton button3 = new JButton("3");
JButton button4 = new JButton("4");

frame.add(button, gbc);

gbc.gridx = 1; //or gridx += 1, or gridx = 1. gridx starts at 0
frame.add(button2, gbc);

gbc.gridx = 0; //must reset the value back to normal
gbc.gridy = 1;
frame.add(button3, gbc);

gbc.gridx = 1;
//since gridy already == 1, no need to change it
frame.add(button4, gbc);