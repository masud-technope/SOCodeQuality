public enum OrderType {

    One(mActivity.getString(R.string.One)), Two(mActivity.getString(R.string.Two));

    private String name;

    private OrderType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static String getEnumByString(String code) {
        for (OrderType e : OrderType.values()) {
            if (code.equals(e.name)) {
                return e.name();
            }
        }
        return null;
    }
}