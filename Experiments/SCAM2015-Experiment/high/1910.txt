public class SortNames<T extends Comparable<? super T>> {
    public void sort(T[] s) {
        for (int i = 0; i<s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if (s[i].compareTo(s[j])>0) {
                    T t = s[i]; s[i] = s[j]; s[j] = t;
                }
            }
        }
    }
    // or static <T extends Comparable<? super T>> void, for static methods
}