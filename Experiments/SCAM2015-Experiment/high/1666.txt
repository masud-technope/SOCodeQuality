Integer[] arr =
    { 12, 67, 1, 34, 9, 78, 6, 31 };
    Arrays.sort(arr, new Comparator<Integer>()
    {
        @Override
        public int compare(Integer x, Integer y)
        {
            return x - y;
        }
    });

    System.out.println("low to high:" + Arrays.toString(arr));