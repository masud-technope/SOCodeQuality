static <T extends Enum<T>> List<String> toStringList(Class<T> clz) {
     try {
        List<String> res = new LinkedList<String>();
        Method getDisplayValue = clz.getMethod("getDisplayValue");

        for (Object e : clz.getEnumConstants()) {
            res.add((String) getDisplayValue.invoke(e));

        }

        return res;
    } catch (Exception ex) {
        throw new RuntimeException(ex);
    }
}