public interface Trader<THIS extends Trader> {
    THIS copyTrader();
    ...
}


public final class MyTrader implements Trader<MyTrader> {
    public MyTrader copyTrader() {
        return new MyTrader(this);
    }
    ...
}