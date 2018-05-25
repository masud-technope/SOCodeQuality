public static int[] findTopKNaive(int[] arr, int k) {
    int[] res = new int[k];
    for (int j = 0; j < k; j++) { 
        int max=Integer.MIN_VALUE, maxIdx = -1;
        for (int i = 0; i < arr.length; i++) { 
            if (max < arr[i]) { 
                max = arr[i];
                maxIdx = i;
            }
        }
        arr[maxIdx] = Integer.MIN_VALUE;
        res[k-1-j] = max;
    }
    return res;
}

public static int[] findTopKSort(int[] arr, int k) { 
    Arrays.sort(arr);
    return Arrays.copyOfRange(arr, arr.length-k,arr.length);
}

public static int[] findTopKHeap(int[] arr, int k) { 
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for (int x : arr) { 
        if (pq.size() < k) pq.add(x);
        else if (pq.peek() < x) {
            pq.poll();
            pq.add(x);
        }
    }
    int[] res = new int[k];
    for (int i =0; i < k; i++) res[i] = pq.poll();
    return res;

}
public static int[] createRandomArray(int n, Random r) { 
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = r.nextInt();
    return arr;
}
public static void main(String... args) throws Exception {
    Random r = new Random(1);
    int k = 4;
    int repeats = 200;
    int n = 5000000;
    long[][] results = new long[3][repeats];
    for (int i = 0; i < repeats; i++) { 
        int[] arr = createRandomArray(n, r);
        int[] myCopy;
        myCopy = Arrays.copyOf(arr, n);
        long start = System.currentTimeMillis();
        findTopKNaive(myCopy, k);
        results[0][i] = System.currentTimeMillis() - start;
        myCopy = Arrays.copyOf(arr, n);
        start = System.currentTimeMillis();
        findTopKSort(myCopy, k);
        results[1][i] = System.currentTimeMillis() - start;
        myCopy = Arrays.copyOf(arr, n);
        start = System.currentTimeMillis();
        findTopKHeap(myCopy, k);
        results[2][i] = System.currentTimeMillis() - start;
    }
    long[] sums = new long[3];
    for (int i = 0; i < repeats; i++) 
        for (int j = 0; j < 3; j++)
        sums[j] += results[j][i];
    System.out.println(Arrays.toString(sums));

    System.out.println("results for statistic test:");
    for (int i = 0; i < repeats; i++) { 
        System.out.println(results[0][i] + " " + results[2][i]);
    }
}