public static class Parent {}  
public static class Child extends Parent {}  
public static class OtherChild extends Parent {}

public <T extends Parent> List<T> myfunction(List<T> myList) {
  myList.add(new Child());
  return myList;
} 

myfunction(new ArrayList<OtherChild>());