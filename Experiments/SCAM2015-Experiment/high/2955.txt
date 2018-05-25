public class Animal {}

public interface TrainingActions<T extends Animal> {}

/**
 * A trainer that can teach an animal a suitable set of tricks
 * @param <A> The type of Animal
 * @param <T> The enum of TrainingActions that can be taught to the specified Animal
 */
public abstract class Trainer<A extends Animal, T extends Enum<T> & TrainingActions<A>> {
    private Set<T> completed = new HashSet<T>();
    public void trainingComplete(T t) {
        completed.add(t);
    }
}

public class Dog extends Animal {};

public class DogTrainer extends Trainer<Dog, DogTrainer.Trainables> {
    public enum Trainables implements TrainingActions<Dog> {
        BARK, BITE, ROLLOVER, FETCH;
    }
}