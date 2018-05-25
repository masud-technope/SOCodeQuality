int height = 5;
for (int i = 1; i <= 2 * height; i += 2) {
    int numAsterisks;
    if (i <= height) {
        numAsterisks = i;
    } else {
        numAsterisks = 2 * height - i;
    }

    for (int j = 0; j < numAsterisks; j++) {
        System.out.print("*");
    }
    System.out.println();
}