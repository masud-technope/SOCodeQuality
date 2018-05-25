public static void main(String[] args)
{
    int[] array = { 2, 0, 1, 2, 1, 2, 1, 0, 2, 0 };

    // Line 1: Define some space to hold the totals
    int[] counts = new int[3]; // To store the (3) different totals

    // Line 2: Get the total of each type
    for (int i : array) counts[i]++;

    // Line 3: Write the appropriate number of each type consecutively back into the array:
    for (int i = 0, start = 0; i < counts.length; start += counts[i++]) Arrays.fill(array, start, start + counts[i], i);

    System.out.println(Arrays.toString(array));
}