public static double slope(int x1, int y1, int x2, int y2) {

    double dy = y2 - y1;
    double dx = x2 - x1;
    return dy / dx;
}

public static void main(String[] args) {

    System.out.println("slope is : " + slope(5, 11, 1, 3));
}