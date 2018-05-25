public class Piece {

    public String getName() {
        return "P";
    }
}

public class King extends Piece {

    @Override
    public String getName() {
        return "K";
    }
}

public class JavaTest {

    public static void showNames(Piece[] p) {
       for (Piece x : p) {
          System.out.println(x.getName());
       }
    }

    public static void main(String[] args) {

        Piece[] p = new Piece[]{
            new Piece(),
            new King()
        };

        showNames(p);
    }
}