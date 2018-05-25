public class Cross {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type a number: ");
        int num = keyboard.nextInt();
        Cross cross = new Cross();
        cross.drawCross(num);
    }

    private void drawCross(int size) {
        // Your turn.
    }
}