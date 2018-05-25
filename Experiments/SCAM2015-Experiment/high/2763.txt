public interface Animal {
    public String getName();
}
public interface EatingBehaviour {
    public void howManyTimes();
}

public class RealLionEatingBehaviour implements EatingBehaviour{
    @Override
    public void howManyTimes() {
        System.out.println("I eat once a day");
    }
}

public class ToyLionEatingBehaviour implements EatingBehaviour {
    @Override
    public void howManyTimes() {
        System.out.println("I never eat! I am a toy lion.");
    }
}

public abstract class Feline implements Animal{
    public abstract void scratchPost();
    private EatingBehaviour eatingBehaviour;
    public EatingBehaviour getEatingBehaviour() {
        return eatingBehaviour;
    }
    public void setEatingBehaviour(EatingBehaviour eatingBehaviour) {
        this.eatingBehaviour = eatingBehaviour;
    }
}

public class Lion extends Feline {
    private String name;
    public String getName() {
        return this.name; 
    }
    public void setName(String name) {
        this.name = name; 
    }
    Lion (String name) {
        this.name=name;
    }
    public void scratchPost(){
        System.out.println(getName() + " Lion Scratching Post!");
    }   
}

public class AnimalFactory {
    public static Animal getAnimalInstance(String type, String name){
        Animal animal=null;
        if ("lion".equalsIgnoreCase(type)) {
            animal = new Lion(name);
        }
        return animal;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private List<Animal> animals = new ArrayList<Animal>();
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void removeAnimal(int index){
        this.animals.remove(index);
    }
    public Animal getAnimal(int index){
        return this.animals.get(index);
    }   
}

public class Zoo {
    public static void main(String args[]) {
        Cage cage = new Cage();
        Animal animal = null;
        animal = AnimalFactory.getAnimalInstance("Lion", "Sweety");
        cage.addAnimal(animal);
        Animal animalFromCage = cage.getAnimal(0);
        if (animalFromCage instanceof Feline) {
            Feline feline = (Feline) animalFromCage;
            feline.setEatingBehaviour(new RealLionEatingBehaviour());
            feline.scratchPost();
            feline.getEatingBehaviour().howManyTimes();
            feline.setEatingBehaviour(new ToyLionEatingBehaviour());
            feline.getEatingBehaviour().howManyTimes();
        }
    }
}