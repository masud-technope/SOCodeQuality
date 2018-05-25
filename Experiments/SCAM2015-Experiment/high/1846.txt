public static String getName() {
    return "MyProgram";
}
public static void main(String... args) {
    new Thread() {
       public void run() {
           System.out.println("My program is " + getName());
        }
    }.start();
}