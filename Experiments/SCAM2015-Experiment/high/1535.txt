int count = 0;
outerLoop:
for (int y = 0; y <= 10; y++) {
    for (int x = 0; x <= 10; x++) {
        if (x * x + y * y - 12 * x - 10 * y + 36 == 0) {
            System.out.println("(" + x + ", " + y + ")");  
            if (++count == 3)
                break outerLoop;
        }
    }
}