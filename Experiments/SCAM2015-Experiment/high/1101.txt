public interface Factory<T> {
  public T create();
}

public <T extends Parent> List<T> myfunction(List<T> myList, 
                                             Factory<? extends T> factory) {
  myList.add(factory.create());
  return myList;
}