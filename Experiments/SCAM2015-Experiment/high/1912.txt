import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempProject extends Box{
    /** Label to update with currently pressed keys */
    JLabel output = new JLabel();

    public TempProject(){
        super(BoxLayout.Y_AXIS);
        for(char i = 'A'; i <= 'Z'; i++){
            String buttonText = new Character(i).toString();
            JButton button = getButton(buttonText);
            add(button);
        }
    }

    public JButton getButton(final String text){
        final JButton button = new JButton(text);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You have clicked: "+text);
                //If you want to do something with the button:
                button.setText("Clicked"); // (can access button because it's marked as final)
            }
        });
        return button;
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                frame.setContentPane(new TempProject());    
                frame.pack();
                frame.setVisible(true);
                new TempProject();
            }
        });
    }   
}