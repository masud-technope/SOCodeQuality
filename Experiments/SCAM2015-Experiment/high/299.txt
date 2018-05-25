public class SomeClass {
    // Usage test:
    public static void main( String [] args ) {
        log( SomeClass.class, "Hola" );
        log( new java.util.Date(), "Hola" );
    }

    // Object version would call Class method... 
    public static void log( Object o , String msg ) {
        log( o.getClass(), msg );
    }
    public static void log( Class c ,  String message ) {
        System.out.println( c.getSimpleName() + " " + message );
    }
}