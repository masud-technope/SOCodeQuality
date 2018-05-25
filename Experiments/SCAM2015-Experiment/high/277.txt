public class IntBuffer {
    private int[] values = new int[10];
    private int size = 0;
    public void add(int value) {
        if (!(size < values.length)) {
            values = java.util.Arrays.copyOf(values, values.length*2);
        }
        values[size++] = value;
    }
    public int[] toArray() {
        return java.util.Arrays.copyOf(values, size);
    }
}