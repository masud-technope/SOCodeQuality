public static void main(String[] args) {
    double Square;
    double Cube;

    DecimalFormat df2 = new DecimalFormat( "###,##0.###" );

    for ( int Number = 0; Number <= 10; Number++ ) {
        Square = Number * Number;
        Cube = Number * Number * Number;
        System.out.println("Number \tSquare \tCube");
        System.out.println(Number + "\t" +  df2.format(Square) + "\t" + df2.format(Cube));
    }
}