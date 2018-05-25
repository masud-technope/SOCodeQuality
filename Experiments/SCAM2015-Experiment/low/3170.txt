import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;

public class ConvertMatrix extends JFrame implements ActionListener{
    JLabel rows = new JLabel ("Numri i rreshtave"+'\n'); 
    JTextField inrows = new JTextField (5);
    JLabel columns = new JLabel ("Numri i kolonave eshte");
    JTextField incolumns = new JTextField (5);
    JLabel matrix = new JLabel("Matrica ka formen");
    JTextField inmatrix = new JTextField(30);
    JButton mat = new JButton("Afisho matricen");
    JTextArea matric = new JTextArea(10,21);

    int x;
    int y; 
    double[][] matrica;

    public ConvertMatrix (){ 
        super ("Matrica e konvertuar");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container content = getContentPane();
        content.setLayout(new FlowLayout ());
        content.setBackground(Color.pink);
        content.add(rows);
        rows.setForeground(Color.blue);
        content.add(inrows);
        content.add(columns);
        columns.setForeground(Color.red);
        content.add(incolumns);
        content.add(matrix);
        content.add(inmatrix);
        matrix.setForeground(Color.gray );
        content.add(mat);

        content.add(matric);

        mat.addActionListener(this);   

        setContentPane(content);
    }

    public  void mbushMatricen(int x, int y){
       matrica = new double[x][y];
       for (int i =0; i<x; i++){
       for (int j=0; j<y; j++){
           matrica[i][j]=((double) Math.random()*10);       
       }
    }
}

public void actionPerformed(ActionEvent event){
    String rresht = inrows.getText();
    int rreshtii = Integer.parseInt(rresht);//kthimi i stringut ne integer
    String shtyll = incolumns.getText();
    int shtylle = Integer.parseInt(shtyll);
    mbushMatricen(rreshtii,shtylle);
    String matricaString = "";
        for(int i=0; i<rreshtii; i++){
            for( int j=0; j<shtylle; j++){
                matricaString += matrica[i][j] + "  ";
            }
        matricaString += "\n";
        }
    matric.setText(matricaString);
}

    public static void main(String []args){
        ConvertMatrix m = new ConvertMatrix();
    }
}