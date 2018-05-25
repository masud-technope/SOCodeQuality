import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class GUI extends JFrame {
    private JButton open, process;
    private JLabel center;
    private JScrollPane scroll;
    private JPanel box;

    public GUI() {
        open = new JButton("Open Image");
        // open.addActionListener(new OpenImageAction());
        process = new JButton("Process");
        // process.addActionListener(new ProcessAction());

        box = new JPanel(new GridLayout(2, 1));
        box.add(open);
        box.add(process);
        JPanel west = new JPanel(new GridBagLayout());
        west.add(box);

        center = new JLabel("Some center label");
        scroll = new JScrollPane(center);

        getContentPane().add(west, BorderLayout.WEST);
        getContentPane().add(scroll);

        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (java.lang.Exception e) {
            JOptionPane.showMessageDialog(null, "GUI Error");
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI();
            }
        });
    }
}