public class GameSettings {
    private int score = 0;
    private float speed = 2.3F;

    // methods omitted for brevity
}

...

public void resetGame() {
    gameSettings = new GameSettings();
}