public class ThreadTest implements Runnable {

    private int functionNumber;
    private int time2start;
    private YourClass obj;

    public ThreadTest(int functionNumber, int time2start, YourClass obj) {
        this.functionNumber = functionNumber;
        this.time2start = time2start;
        this.obj = obj;
    }

    public void run() {
        try {
            Thread.currentThread().sleep(time2start);
        } catch (Exception ex) {
        }//Time Delay before executing methods
        switch (functionNumber) {
            case 1:
                obj.runFirst();
                break;
            case 2:
                obj.runSecond();
                break;
            case 3:
                obj.runThird();
                break;
            case 4:
                obj.runFourth();
                break;
            //keep adding
        }
    }
}