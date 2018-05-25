public abstract class AnimalBase {
    private String name;
    private int age;
    private boolean gender;

    // getters and setters for the above are good to have here
}

public interface Animal {
    public void move();
    public void eat();
    public void sleep();
}

// The below won't compile because the contract for the interface changed.
// You'll have to implement eat and sleep for each object.

public class Reptiles extends AnimalBase implements Animal {
    public void move() {
        System.out.println("Slither!");
    }
}

public class Birds extends AnimalBase implements Animal {
    public void move() {
        System.out.println("Flap flap!");
    }
}

public class Amphibians extends AnimalBase implements Animal {
    public void move() {
        System.out.println("Some sort of moving sound...");
    }
}

// in some method, you'll be calling the below

List<Animal> animalList = new ArrayList<>();

animalList.add(new Reptiles());
animalList.add(new Amphibians());
animalList.add(new Birds());

// call your method without fear of it being generic

for(Animal a : animalList) {
    a.move();
}