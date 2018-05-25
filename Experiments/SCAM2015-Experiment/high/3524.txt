public class Vehicle implements Adder<Vehicle> {
    @Override
    public void add(Vehicle newObject, List<Vehicle> myList) {
        myList.add(newObject);
    }
}