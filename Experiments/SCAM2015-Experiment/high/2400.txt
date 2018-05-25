for (int i = 2; i <= max; i++) {
    counter = 0;
    for (int n = 2; n < i; n++) {
        if (i % n == 0) {
            counter++;
        }
    }
    if (counter == 0) {
        System.out.println(i);
    }
}