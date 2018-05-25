import java.awt.*;
import javax.swing.*;

public class TextAreaPreferredHeight2
{
 public static void main(String[] args)
 {
  String text = "one two three four five six seven eight nine ten ";
  JTextArea textArea = new JTextArea(text);
  textArea.setColumns(30);
  textArea.setLineWrap( true );
  textArea.setWrapStyleWord( true );
  textArea.append(text);
  textArea.append(text);
  textArea.append(text);
  textArea.append(text);
  textArea.append(text);
  textArea.setSize(textArea.getPreferredSize().width, 1);
  JOptionPane.showMessageDialog(
   null, textArea, "Not Truncated!", JOptionPane.WARNING_MESSAGE);
 }
}