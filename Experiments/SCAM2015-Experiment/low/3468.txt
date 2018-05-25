public static String word(int num, String words)
{
    // split words string into array by the spaces
    String[] wordArray = words.split(" "); // or = words.split("\\s+");

    // if the number is within the range
    if (num > 0 && num <= wordArray.length) {
        return wordArray[num - 1]; // return the word from the word array
    } else { // the number is not within the range of words
        return null;
    }
}