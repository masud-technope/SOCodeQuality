public interface SomeInterface {
  void doSomething();
};

public enum First implements SomeInterface {
  ONE,TWO,THREE;
  @Override
  public void doSomething() { ... }
};
...
Map<String, SomeInterface> myMap = new HashMap<String, SomeInterface>();
for (First item : First.values()) {
  myMap.put(item.toString(), item);
}
...

public void work(String message){
  SomeInterface obj = myMap.get(message);
  if (obj != null) {
    obj.doSomething();
  }
}