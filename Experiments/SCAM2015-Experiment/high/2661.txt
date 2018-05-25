abstract class IOtfHandler {
    private int source;
    private int func;

    public void setSource(int source) {
        this.source = source;
    }
    // etc
}
class EnterLeaverHandler extends IOtfHandler {
    private long time;
    // etc
}
class DefFunctionHandler extends IOtfHandler {
    private String name;
    // etc
}