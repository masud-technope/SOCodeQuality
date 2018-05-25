abstract class IOtfHandler {
    private int source;
    private int func;

    public void setSource(int source) {
        this.source = source;
    }
    public int getSource() {
        return source;
    }
    public void setFunc(int func) {
        this.func = func;
    }
    public int getFunc() {
        return func;
    }

    // abstract handle method
    abstract public void handle();
}

class EnterLeaverHandler extends IOtfHandler {
    private long time;
    private int cpuid;

    // getters and setters
    public void setTime(long time) {
        this.time = time;
    }
    public long getTime() {
        return time;
    }
    public void setCpuId(int cpuid) {
        this.cpuid = cpuid;
    }
    public int getCpuId() {
        return cpuid;
    }

    // constructor
    public EnterLeaverHandler(long time, int cpuid, int source, int func) {
        setTime(time);
        setCpuId(cpuid);
        setSource(source);
        setFunc(func);
    }

    // handle method
    public void handle() {
        System.out.println("EnterLeaverHandler.handle()");
        // Do whatever class-specific handling you might want to do in here.
    }
}

class DefFunctionHandler extends IOtfHandler {
    private String name;
    private int funcGroup;
    private int stream;

    // getters and setters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setFuncGroup(int funcGroup) {
        this.funcGroup = funcGroup;
    }
    public int getFuncGroup() {
        return funcGroup;
    }
    public void setStream(int stream) {
        this.stream = stream;
    }
    public int getStream() {
        return stream;
    }

    // constructor
    public DefFunctionHandler(String name, int funcGroup, int stream, int source, int func) {
        setName(name);
        setFuncGroup(funcGroup);
        setStream(stream);
        setSource(source);
        setFunc(func);
    }

    // handle method
    public void handle() {
        System.out.println("DefFunctionHandler.handle()");
        // Do whatever class-specific handling you might want to do in here.
    }
}

public class Main {
    public static void main(String[] args) {
        IOtfHandler h1 = new DefFunctionHandler("name", 0, 0, 0, 0);
        IOtfHandler h2 = new EnterLeaverHandler(0, 0, 0, 0);
        h1.handle();
        h2.handle();
    }
}