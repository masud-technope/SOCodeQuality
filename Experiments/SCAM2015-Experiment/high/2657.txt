public class EnterLeaveHandler implements IOtfHandler {
    private long time;
    private int func;
    private int cpuid;
    private int source;

    // Please don't use varargs like this; read the whole answer!!
    public void handle(Object ... args) {
        time = (Long) args[0];
        func = (Integer) args[1];
        cpuid = (Integer) args[2];
        source = (Integer) args[3];
    }
}