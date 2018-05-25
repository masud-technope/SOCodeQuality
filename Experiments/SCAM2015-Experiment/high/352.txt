public class MyClass {
  // Use CopyOnWriteArrayList to avoid ConcurrentModificationExceptions if a
  // listener attempts to remove itself during event notification.
  private final CopyOnWriteArrayList<MyChangeListener> listeners;

  public class MyClass() {
    this.listeners = new CopyOnWriteArrayList<MyChangeListener>();
  }

  public void addMyChangeListener(MyChangeListener l) {
    this.listeners.add(l);
  }

  public void removeMyChangeListener(MyChangeListener l) {
    this.listeners.remove(l);
  }

  // Event firing method.  Called internally by other class methods.
  protected void fireChangeEvent() {
    MyChangeEvent evt = new MyChangeEvent(this);

    for (MyChangeListener l : listeners) {
      l.changeEventReceived(evt);
    }
  }
}