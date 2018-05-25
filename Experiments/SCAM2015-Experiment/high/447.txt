button1 = new JToggleButton(new ImageIcon("0.jpg"));
button1.setSelectedIcon(new ImageIcon("1.jpg"));
button2 = new JToggleButton(new ImageIcon("0.jpg"));
button2.setSelectedIcon(new ImageIcon("2.jpg"));
...
ButtonGroup group = new ButtonGroup();
group.add(button1);
group.add(button2);
...