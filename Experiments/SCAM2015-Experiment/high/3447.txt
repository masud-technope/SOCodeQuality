public class PrintPattern {

public static void main(String[] args){
    printPattern1();
    printPattern2();
    printPattern3();
    printPattern4();
}

public static void printPattern1(){

    for (int i = 0; i<5; i++){
        for(int j = 5; j>i; j--)
            System.out.print(j);
        System.out.println();
    }
}

public static void printPattern2(){

    for (int i = 0; i<5; i++){
        for(int k = 0; k<4-i; k++)
            System.out.print(" ");
        for(int j = 1; j<=i+1; j++)
            System.out.print(j);
        System.out.println();
    }
}

public static void printPattern3(){

    for (int i = 0; i<5; i++){
        for(int k = 0; k<i; k++)
            System.out.print(" ");
        for(int j = i+1; j<=5; j++)
            System.out.print(j);

        System.out.println();
    }
}

public static void printPattern4(){

    for (int i = 0; i<5; i++){
        for(int k = 0; k<Math.abs(2-i); k++)
            System.out.print(" ");
        for(int j = 1; j<=5-2*Math.abs(2-i); j++)
            System.out.print(j);
        for (int p = 0; p<Math.abs(2-i); p++)
            System.out.print(" ");
        System.out.println();
    }
}