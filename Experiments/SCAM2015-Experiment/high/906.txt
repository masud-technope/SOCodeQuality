public enum BazEnum {
    FOO(0x01),
    BAR(0x09);

    private int value;

    BazEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static BazEnum fromValue(int value) {
        for (BazEnum curenum : BazEnum.values()) {
            if (curenum.getValue() == value) {
                return curenum;
            }
        }
        return null;
    }
}

public class MainClass {
    public static void main(String[] params) {
        BazEnum baz = BazEnum.fromValue(0x09);

        switch baz {
            case FOO:
                ...
                break;
            case BAR:
                ...
                break;
            default:
                ...
                break;
        }
    }
}