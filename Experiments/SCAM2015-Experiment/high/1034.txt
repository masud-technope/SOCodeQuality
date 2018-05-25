public static void main(String[] args) {
    JFrame f = new JFrame();
    JPanel p = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawLine(0, 0, 100, 100);
        }
    };
    f.add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
}