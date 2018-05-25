abstract class ActionAdapter implements ActionListener {
}
...
frame.Console_Bouton.addActionListener(
    new ActionAdapter(){ // anonymous inner class 
      void actionPerformed(ActionEvent e){
         ... // (no need to check source!)
      }
    });