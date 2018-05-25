public class EnumUser {
    public String getName(EnumClass value) {
        switch (value) {
            case VALUE1: return "value 1";
            // No VALUE2 case.
            case VALUE3: return "value 3";
            default:     return "other";
        }
    }
}