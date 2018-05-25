import java.awt.event.ActionEvent;
import javax.swing.*;

public class InfoFromTextFields {
   private static void createAndShowUI() {
      JFrame frame = new JFrame("InfoFromTextFields");
      frame.getContentPane().add(new MainGui());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            createAndShowUI();
         }
      });
   }
}

class NamePanel extends JPanel {
   private JTextField nameField = new JTextField(10);
   private JTextField surnameField = new JTextField(10);

   public NamePanel() {
      add(new JLabel("Name:"));
      add(nameField);
      add(Box.createHorizontalStrut(15));
      add(new JLabel("Surname:"));
      add(surnameField);
   }

   public String getNameText() {
      return nameField.getText();
   }

   public String getSurnameText() {
      return surnameField.getText();
   }
}

class MainGui extends JPanel {
   private JTextField nameField = new JTextField(10);
   private JTextField surnameField = new JTextField(10);

   public MainGui() {
      nameField.setEditable(false);
      surnameField.setEditable(false);

      add(new JLabel("Name:"));
      add(nameField);
      add(Box.createHorizontalStrut(15));
      add(new JLabel("Surname:"));
      add(surnameField);

      add(Box.createHorizontalStrut(15));
      add(new JButton(new AbstractAction("Get Names") {
         @Override
         public void actionPerformed(ActionEvent arg0) {
            NamePanel namePanel = new NamePanel();
            int result = JOptionPane.showConfirmDialog(nameField, namePanel,
                     "Get Names", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
               nameField.setText(namePanel.getNameText());
               surnameField.setText(namePanel.getSurnameText());
            }
         }
      }));
   }
}