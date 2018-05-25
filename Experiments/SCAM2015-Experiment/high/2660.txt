public class EnterLeaveHandler implements IOtfHandler {
    public void handle(long time, int func, int cpuid, int source) {
    // Do things with your shiny new variables
}
public class DefFunctionHandler implements IOtfHandler {
    public void handle(int stream, int func, String name, int funcgroup, int source) {
        // Do things with your shiny new variables
    }
}