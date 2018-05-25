import java.util.*;

public enum TestEnum {
    ONE(1), TWO(2), SIXTY_NINE(69);

    private final int number;    
    TestEnum(int number) {
        this.number = number;
    }

    private static final Map<Integer,TestEnum> map;
    static {
        map = new HashMap<Integer,TestEnum>();
        for (TestEnum v : TestEnum.values()) {
            map.put(v.number, v);
        }
    }
    public static TestEnum findByKey(int i) {
        return map.get(i);
    }

    public static void main(String[] args) {
        System.out.println(TestEnum.findByKey(69)); // prints "SIXTY_NINE"

        System.out.println(
            TestEnum.values() == TestEnum.values()
        ); // prints "false"
    }
}