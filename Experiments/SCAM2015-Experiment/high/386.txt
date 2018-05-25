// get the class of an object instance - any object.  
// We just defined an empty one, and did everything as static.
class EmptyClass{}
Class loadClass = new EmptyClass().getClass();
// load the image and put it directly into an ImageIcon if it suits you
ImageIcon ii = new ImageIcon(loadClass.getResource("/com/blah/Images/a.png"));
// and add the ImageIcon to your JComponent or JPanel in a JLabel
aComponent.add(new JLabel(ii));