public static String word(int num, String words)
{
    for (int i = 0; i < words.length(); i++) { // every character in words
        if (words.substring(i, i+1).equals(" ")) { // if word is a space
            num = num - 1; // you've found the next word, so subtract 1 (number of words left is remaining)
        }
        if (num == 1) { // found all words
            // return this word
            int lastIndex = i+1;
            while (lastIndex < words.length()) { // until end of words string
                if (words.substring(lastIndex, lastIndex+1).equals(" ")) {
                    break;
                }
                lastIndex = lastIndex + 1; // not a space so keep moving along the word
            }
            /*
            // or you could use this to find the last index:
            int lastIndex = words.indexOf(" ", i + 1); // next space after i+1
            if (lastIndex == -1) { // couldn't find another space
                lastIndex = words.length(); // so just make it the last letter in words
            }*/
            if (words.substring(i, i+1).equals(" ")) { // not the first word
                return words.substring(i+1, lastIndex);
            } else {
                return words.substring(i, lastIndex);
            }
        }
    }
    return null; // didn't find word
}