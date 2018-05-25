public class MyChangeEvent extends EventObject {
  // This event definition is stateless but you could always
  // add other information here.
  public MyChangeEvent(Object source) {
    super(source);
  }
}