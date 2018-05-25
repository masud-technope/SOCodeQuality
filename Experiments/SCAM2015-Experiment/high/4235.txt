static int rom2int(String s) {
    if (s == null || s.length() == 0) {
        return 0;
    }
    // Total value.
    int total = 0;
    // The most recent.
    char current = s.charAt(0);
    // Total for the current run.
    int run = valueOf(current);

    for (int i = 1; i < s.length(); i++) {
        char next = s.charAt(i);
        int value = valueOf(next);
        if (next == current) {
            // We're in a run - just keep track of its value.
            run += value;
        } else {
            // Up or down?
            if (value < valueOf(current)) {
                // Gone down! Add.
                total += run;
            } else {
                // Gone UP! Subtract.
                total -= run;
            }
            // Run ended.
            run = valueOf(next);
        }
        // Kee track of most recent.
        current = next;
    }
    return total + run;
}

private void test(String s) {
    System.out.println("Value of " + s + " = " + rom2int(s));
}

public void test() {
    test("IVX");
    test("IIVVL");
    test("IIX");
    test("MCCMIIX");
    test("MVVV");
}