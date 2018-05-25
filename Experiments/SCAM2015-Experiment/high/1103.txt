import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumn;

public class TableColumnSizeTest {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // prepare table
                JTable table = new JTable(new String[][] {  
                                 { "Row 1 Col A", "Row 1 Col B" }, 
                                 { "Row 2 Col A", "Row 2 Col B" } }, 
                                 new String[] { "ColA", "ColB" });

                // add into scroll pane
                f.getContentPane().add(new JScrollPane(table));

                // turn off auto resize
                table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

                // set preferred column widths
                int index = 0;
                while (index < 2) {
                    TableColumn a = table.getColumnModel().getColumn(index);
                    a.setPreferredWidth(10);
                    index++;
                }

                f.pack();

                f.setVisible(true);
            }
        });
    }
}