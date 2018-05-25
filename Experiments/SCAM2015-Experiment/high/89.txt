import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tester {

    public Tester(){

        JComboBox box = new JComboBox();
        box.addItem("One");
        box.addItem("Two");
        box.addItem("Three");
        box.addItem("Four");

        box.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                System.out.println(e.getItem() + " " + e.getStateChange() );
            }
        });

        JFrame frame = new JFrame();
        frame.getContentPane().add(box);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String [] args) {
        Tester tester = new Tester();
    }
}