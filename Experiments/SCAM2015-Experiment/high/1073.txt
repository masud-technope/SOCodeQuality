public class Fruit implements Serializable{

    private static final long serialVersionUID = 1L;
    public final Fruit ORANGE = new Fruit("orange");
    public final Fruit LEMON = new Fruit("lemon");

    private String name;

    private Fruit(String name){
        this.name = name;
    }
}