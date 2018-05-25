import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class Test {

    public Test() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel dp = new DrawPanel(500, 400);

        frame.add(dp);

        frame.pack();
        frame.setVisible(true);

        dp.addOval(0, 0, dp.getWidth(), dp.getHeight(), Color.GREEN);
        dp.addOval(0, 0, dp.getWidth(), dp.getHeight(), Color.BLUE);
        //dp.addOval(5, 5, dp.getWidth(), dp.getHeight(),Color.RED);//uncomment here to see 2nd circle better
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Test();
            }
        });
    }
}

class DrawPanel extends JPanel {

    private ArrayList<MyOval> ovals = new ArrayList<>();
    private int width, height;

    public DrawPanel(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);

        Graphics2D g2d = (Graphics2D) grphcs;
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));

        for (MyOval oval : ovals) {
            g2d.setColor(oval.getColor());
            g2d.drawOval(oval.getX(), oval.getY(), oval.getWith(), oval.getHeight());
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }

    void addOval(int x, int y, int w, int h, Color color) {
        ovals.add(new MyOval(x, y, w, h, color));
        repaint();
    }
}

class MyOval {

    int x, y, with, height;
    Color color;

    public MyOval(int x, int y, int with, int height, Color color) {
        this.x = x;
        this.y = y;
        this.with = with;
        this.height = height;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWith() {
        return with;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}