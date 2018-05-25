private enum Type{
    TYPE_A(10 /*10 - weight of this type*/), TYPE_B(1), TYPE_C(5), TYPE_D(20), TYPE_E(7);

private int weight;

private Type(int weight) {
    this.weight = weight;
}

private int getWeight() {
    return weight;
}


    private static final List<Type> VALUES =
        Collections.unmodifiableList(Arrays.asList(values()));

    private int summWeigts() {
       int summ = 0;
       foreach(Type value: VALUES) 
          summ += value.getWeight();
       return summ;
    }
    private static final int SIZE = summWeigts();
    private static final Random RANDOM = new Random();

    public static Type randomType()  {
        int randomNum = RANDOM.nextInt(SIZE);
        int currentWeightSumm = 0;
        for(Type currentValue: VALUES) {
           if (randomNum > currentWeightSumm && 
               randomNum <= (currentWeightSumm + currentValue.getWeight()) {
             break;
           }
           currentWeightSumm += currentValue.getWeight();
        }

        return currentValue.get();
    }
}