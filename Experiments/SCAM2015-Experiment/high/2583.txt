class Ability {

    private final int[] rolls;
    private int value;

    public Ability(int dice) {
        rolls = new int[dice];
    }

    public int roll() {
        value = 0;
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = dice.Dice.D6.getNewRoll();
            value += rolls[i];
        }
        return value;
    }

    public int getValue() {
        return value;
    }

    public void printRolls() {
        // ... tbd ...
    }

}