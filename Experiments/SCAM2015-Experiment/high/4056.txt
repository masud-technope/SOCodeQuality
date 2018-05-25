for(int i = 0 ; i < maxCounter ; i++) {
    String text = "Antwoord Vraag" + (i + 1) + ": " + antwoord.get(i);
    JLabel label = new JLabel(text, SwingConstants.LEFT);
    label.setForeground(Color.red);
    center.add(label);
}