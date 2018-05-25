public class TestPerf {

    private static int NUM_RUN;
    private static Random r = new Random(System.currentTimeMillis());
    private static boolean random = false; //toggle to false for no duplicates in original list


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 30_000; i++) {
            list.add(getRandomString());
        }

        //warm up
        for (int i = 0; i < 10_000; i++) {
            method1(list);
            method2(list);
            method3(list);
        }

        NUM_RUN = 100;
        long sum = 0;
        long start = System.nanoTime();
        for (int i = 0; i < NUM_RUN; i++) {
            sum += method1(list);
        }
        long end = System.nanoTime();
        System.out.println("set: " + (end - start) / 1000000);

        sum = 0;
        start = System.nanoTime();
        for (int i = 0; i < NUM_RUN; i++) {
            sum += method2(list);
        }
        end = System.nanoTime();
        System.out.println("arraylist: " + (end - start) / 1000000);

        sum = 0;
        start = System.nanoTime();
        for (int i = 0; i < NUM_RUN; i++) {
            sum += method3(list);
        }
        end = System.nanoTime();
        System.out.println("linkelist: " + (end - start) / 1000000);

        System.out.println(sum);
    }

    private static int method1(final List<String> list) {
        Set<String> set = new HashSet<>(list.size(), 1);
        for (String s : list) {
            set.add(s);
        }
        return set.size();
    }

    private static int method2(final List<String> list) {
        List<String> undefined = new ArrayList<>();
        for (String s : list) {
            if (!undefined.contains(s)) {
                undefined.add(s);
            }
        }
        return undefined.size();
    }

    private static int method3(final List<String> list) {
        List<String> undefined = new LinkedList<>();

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            if (!undefined.contains(value)) {
                undefined.add(value);
            }
        }
        return undefined.size();
    }

    private static String getRandomString() {
        if (!random) {
            return "skdjhflkjrglajhsdkhkjqwhkdjahkshd";
        }
        int size = r.nextInt(100);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            char c = (char) ('a' + r.nextInt(27));
            sb.append(c);
        }
        System.out.println(sb);
        return sb.toString();
    }
}