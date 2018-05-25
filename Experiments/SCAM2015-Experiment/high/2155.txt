public class TimeTest {

public static void main(String[] args) {
    Time time = new Time();
    time.setTime(10, 10);
    doTest(time);

}

private static void doTest(Time time) {
    //set the time to 10 hours and 10 minutes
    System.out.println("Get as String: " + time.getAsString());
    // set the new time to test the getElapsedTime(time) method
    Time newTime = new Time(11, 30);
    System.out.println("Get Elapsed Time: " + time.getElapsedTime(newTime) + " minutes");
}