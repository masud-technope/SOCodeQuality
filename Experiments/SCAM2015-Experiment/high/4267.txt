static int[] invertieren(int[] werte) {
    int[] werte1 = new int[werte.length];
    for (int i = 0; i < werte.length; i++) {
        werte1[i] = werte[werte.length - i - 1];
    }
    return werte1;
}