import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

class TextAreaLoad
{
    public static void main(String a[])
    {
        final JTextArea edit = new JTextArea(30, 60);
        edit.setText("one\ntwo\nthree");
        edit.append("\nfour\nfive");

        JButton read = new JButton("Read TextAreaLoad.txt");
        read.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    FileReader reader = new FileReader( "TextAreaLoad.txt" );
                    BufferedReader br = new BufferedReader(reader);
                    edit.read( br, null );
                    br.close();
                    edit.requestFocus();
                }
                catch(Exception e2) { System.out.println(e2); }
            }
        });

        JButton write = new JButton("Write TextAreaLoad.txt");
        write.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    FileWriter writer = new FileWriter( "TextAreaLoad.txt" );
                    BufferedWriter bw = new BufferedWriter( writer );
                    edit.write( bw );
                    bw.close();
                    edit.setText("");
                    edit.requestFocus();
                }
                catch(Exception e2) {}
            }
        });

        JFrame frame = new JFrame("TextArea Load");
        frame.getContentPane().add( new JScrollPane(edit), BorderLayout.NORTH );
        frame.getContentPane().add(read, BorderLayout.WEST);
        frame.getContentPane().add(write, BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
    }
}