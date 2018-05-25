public int[][] copy(int[][] input) {
      int[][] target = new int[input.length][];
      for (int i=0; i <input.length; i++) {
        target[i] = Arrays.copyOf(input[i], input[i].length);
      }
      return target;
}