double parse(String ratio) {
    if (ratio.contains("/")) {
        String[] rat = ratio.split("/");
        return Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
    } else {
        return Double.parseDouble(ratio);
    }
}