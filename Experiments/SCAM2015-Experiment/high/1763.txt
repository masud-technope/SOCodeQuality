ArrayList<Integer> numbers = new ArrayList<Integer>();
for (int i = 0; i < 20; ++i) {
    numbers.add(i);
}
Collections.shuffle(numbers);
for (int i = 0; i < 5; ++i) {
    Log.d("Random number", numbers.get(i).toString());
}