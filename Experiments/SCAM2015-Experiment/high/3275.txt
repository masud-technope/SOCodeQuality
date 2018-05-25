public static void one(){
    Integer three;
    Integer four;
    three = 3;
    four = 4;
    two(three, four); // add parameters here
}
public static void two(Integer three, Integer four){
    Integer five; // declare five here
    five = three + four;
    System.out.println(five);
}