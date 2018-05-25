public class Coin {
    private CoinName coinName;
    private int year;

    public Coin(CoinName coinName, int year) {
        this.coinName = coinName;
        this.year = year;
    }

    @Override
    public String toString() {  
        return coinName + " " + year;
    }
}