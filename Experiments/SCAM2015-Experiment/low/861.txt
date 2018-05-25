double one = 0.0;
double two = 0.0;
 try {
   one = Double.parseDouble(field1.getText());
 }
 catch(Exception ex) {
    field1.setText("0");
 }

 try {
    two = Double.parseDouble(field2.getText());
 }
 catch(Exception ex) {
   field2.setText("0");
 }

numSum.setText("" + (one + two));