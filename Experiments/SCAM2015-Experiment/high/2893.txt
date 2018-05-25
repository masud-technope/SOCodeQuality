public class CoinContainer {
    private Coin[] coins;

    public CoinContainer() {  
        coins = new Coin[10];

        coins[0] = new Coin(CoinName.PENNY, 2011);
        coins[1] = new Coin(CoinName.DIME, 1952);
        coins[2] = new Coin(CoinName.DOLLAR, 1999);
        coins[3] = new Coin(CoinName.NICKEL, 2004);
        coins[4] = new Coin(CoinName.DIME, 1952);
        coins[5] = new Coin(CoinName.DOLLAR, 1945);
        coins[6] = new Coin(CoinName.PENNY, 2011);
        coins[7] = new Coin(CoinName.QUARTER, 1961);
        coins[8] = new Coin(CoinName.NICKEL, 1983);
        coins[9] = new Coin(CoinName.FIFTY_CENT, 1963);
    }

    @Override
    public String toString() {
        String myString = "";

        for(Coin coin : coins) {
            myString += coin + "\n";
        }

        return myString;
    }

    public static void main(String[] args) {
        CoinContainer coinContainer = new CoinContainer();

        System.out.println(coinContainer);
    }
}