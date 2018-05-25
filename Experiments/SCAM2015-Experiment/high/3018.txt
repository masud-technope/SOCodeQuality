import java.awt.*;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.border.*;


/**
 *
 * @author Rashed
 */
 class GridBagLayoutDemo extends JFrame{


    public JLabel createLabel(String txt, int width, int height, Color color)
    {
        JLabel label = new JLabel(txt);
        label.setOpaque(true);
        label.setBackground(color);
        label.setPreferredSize(new Dimension(width, height));
        return label;
    }

    public GridBagLayoutDemo() throws HeadlessException {
      // setSize(400,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JPanel panel = new JPanel(new java.awt.GridBagLayout());
       panel.setBorder(new EmptyBorder(10, 10, 10, 10));
       GridBagConstraints labCnst = new GridBagConstraints();

       Dimension preferredSize = new Dimension(140,20);

       labCnst.insets = new Insets(3, 3, 3, 3);

       JLabel title = new JLabel("My Title");
       JLabel title2 = new JLabel("My Title");
       JLabel title3 = new JLabel("My Title");

       JLabel selectionLabel1 = new JLabel("");
       selectionLabel1.setBorder(new LineBorder(Color.BLACK));
       JLabel selectionLabel2 = new JLabel("");
       selectionLabel2.setBorder(new LineBorder(Color.BLACK));
       JLabel selectionLabel3 = new JLabel("");
       selectionLabel3.setBorder(new LineBorder(Color.BLACK));

       selectionLabel1.setPreferredSize(preferredSize);
       selectionLabel2.setPreferredSize(preferredSize);
       selectionLabel3.setPreferredSize(preferredSize);

       JButton browse1 = new JButton("Browse");
       JButton browse2 = new JButton("Browse");
       JButton browse3 = new JButton("Browse");


        labCnst.gridx = 0;
        labCnst.gridy = 0;
        panel.add(title, labCnst);
        labCnst.gridy = 1;
        panel.add(title2, labCnst);
        labCnst.gridy = 2;
        panel.add(title3, labCnst);

        labCnst.gridx = 1;
        labCnst.gridy = 0;
        panel.add(selectionLabel1, labCnst);
        labCnst.gridy = 1;
        panel.add(selectionLabel2, labCnst);
        labCnst.gridy = 2;
        panel.add(selectionLabel3, labCnst);

        labCnst.gridx = 3;
        labCnst.gridy = 0;
        panel.add(browse1, labCnst);
        labCnst.gridy = 1;
        panel.add(browse2, labCnst);
        labCnst.gridy = 2;
        panel.add(browse3, labCnst);


       //labCnst.anchor = GridBagConstraints.LINE_END;


       add(panel);
       pack();

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GridBagLayoutDemo().setVisible(true);
            }
        });
    }
}