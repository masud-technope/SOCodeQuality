import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Bird> {

    private List<T> birdList;

    public Cage() {
        birdList = new ArrayList<T>();
    }

    public void addBird(T bird) {
        birdList.add(bird);
    }

}