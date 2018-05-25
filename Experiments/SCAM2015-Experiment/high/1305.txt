import java.awt.*;
import javax.swing.*;

public class CustomComponent12 extends JFrame {

    private static final long serialVersionUID = 1L;

    public CustomComponent12() {
        Box box = new Box(BoxLayout.Y_AXIS);
        box.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(Box.createVerticalGlue());
        box.add(new CustomComponents12());
        box.add(Box.createVerticalGlue());
        add(box);
        pack();
        setTitle("Custom Component Test / BoxLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMaximumSize(getMinimumSize());
        setMinimumSize(getMinimumSize());
        setPreferredSize(getPreferredSize());
        setLocation(150, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                CustomComponent12 main = new CustomComponent12();
            }
        };
        javax.swing.SwingUtilities.invokeLater(r);
    }
}

class CustomComponents12 extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(100, 100);
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(100, 100);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }

    @Override
    public void paintComponent(Graphics g) {
        int margin = 10;
        Dimension dim = getSize();
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
    }
}