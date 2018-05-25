int number = 12345;

char[] arr = new char[(int) (Math.log10(number) + 1)];

for (int i = arr.length - 1; i >= 0; i--) {
    arr[i] = (char) ('0' + (number % 10));
    number /= 10;
}

System.out.println(Arrays.toString(arr));