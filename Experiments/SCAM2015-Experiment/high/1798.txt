public enum LegNo {
    NO_LEG(-1), LEG_ONE(1), LEG_TWO(2);

    private int legNo;

    private static Map<Integer, LegNo> map = new HashMap<Integer, LegNo>();

    static {
        for (LegNo legEnum : LegNo.values()) {
            map.put(legEnum.legNo, legEnum);
        }
    }

    private LegNo(final int leg) { legNo = leg; }

    public static LegNo valueOf(int legNo) {
        return map.get(legNo);
    }
}