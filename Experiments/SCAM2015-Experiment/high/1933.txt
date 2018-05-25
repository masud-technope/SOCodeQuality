package stack;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Aitor extends JFrame implements ActionListener{
    JTable table;
    JPanel panel = new JPanel();
    JButton button = new JButton("Add"); 

    String data[][]={{"hey","hey"},{"hey","hey"},{"hey","hey"},{"hey","hey"},                        {"hey","hey"},{"hey","hey"}
,{"hey","hey"},{"hey","hey"},{"hey","hey"},{"hey","hey"},{"hey","hey"},{"hey","hey"},{"hey","hey"},{"hey","hey"}
,{"hey","hey"},{"hey","hey"}};
    String columns[] = {"First","Second"};

    public Aitor(){
        setLayout(new BorderLayout());
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(500,400));
        button.addActionListener(this);
        add(panel,BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

    }

    public static void main(String [] a){
        Aitor aitor = new Aitor();
        aitor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aitor.pack();
        aitor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        panel.removeAll();
        table =new JTable(data,columns);
        panel.add(new JScrollPane(table),BorderLayout.CENTER);
        repaint();
        revalidate();
    }
}