private static final char[] COLORS = {'A', 'B', 'C', 'D', 'E', 'F'};


public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input;
    boolean inputOk;

    do {
        inputOk = true;

        // read the input
        System.out.print("Enter your guess: ");
        input = br.readLine().toUpperCase();

        // do the check
        for (int i = 0; i < input.length() && inputOk; i++) {
            for (int j = 0; j < COLORS.length; j++) {
                if (input.charAt(i) == COLORS[j])
                    break;
                if (j == COLORS.length - 1)
                    inputOk = false;
            }
        }

        // input isn't ok
        if (!inputOk)
            System.out.println("Found incorrect input! Please only use 'A', 'B', 'C', 'D', 'E', or 'F'.");
    } while (!inputOk);
}