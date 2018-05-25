public interface Trader {
    Trader copyTrader();
    ...
}


public final class MyTrader implements Trader {
    MyTrader copyTrader() {
        return new MyTrader(this);
    }
    ...
}