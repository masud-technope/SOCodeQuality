public class SwitchingOnAnull {
    public static void main(String[] args) {        
        java.math.RoundingMode x = null;
        switch(x) {};

        switch((Integer) null) {};

        switch((Character) null) {
            default: System.out.println("I've got sunshine!");
        }       
    }
}