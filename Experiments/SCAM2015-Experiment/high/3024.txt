class ObjectAGenerator implements Generator<ObjectA> {
    public ObjectA generate() {
       return new ObjectA("random", "stuff", "constructor");
    }

    public ObjectA[] generateSeveral(int amount) {
        ObjectA[] result = new ObjectA[amount];
        for(int i=0; i<amount; i++) {
            result[i] = generate();
        }
    }
}