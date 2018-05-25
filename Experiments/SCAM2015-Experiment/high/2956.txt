public class Dog extends Animal {
    public enum BasicTrainables implements TrainingActions<Dog> {
        SIT, COME, STAY, HEEL;
    }
    public enum IntermediateTrainables implements TrainingActions<Dog> {
        BARK, BITE, ROLLOVER, FETCH;
    }
    public enum AdvacedTrainables implements TrainingActions<Dog> {
        SNIFF_DRUGS, FIND_PERSON, ATTACK, GUARD;
    }
};

public class PuppyTrainer extends Trainer<Dog, Dog.BasicTrainables> {}

public class ObedienceTrainer extends Trainer<Dog, Dog.IntermediateTrainables> {}

public class PoliceTrainer extends Trainer<Dog, Dog.AdvacedTrainables> {}