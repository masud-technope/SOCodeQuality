public static String[] removeDuplicate(String[] words){
    // remember which word is a duplicate
    boolean[] isDuplicate = new boolean[words.length];
    // and count them
    int countDuplicate = 0;
    for (int i = 0; i < words.length ; i++){
        // only check "forward" because "backwards checked" duplicates have been marked yet
        for(int j = i + 1; j < words.length ; j++){
            if (words[i].equals(words[j])) {
                isDuplicate[j] = true;
                countDuplicate++;
            }
        }
    }
    // collect non-duplicate strings
    String[] tmp = new String[words.length - countDuplicate];
    int j = 0;
    for (int i = 0; i < isDuplicate.length; i++) {
        if (isDuplicate[i] == false) {
            tmp[j] = words[i];
            j++;
        }
    }
    // and return them
    return tmp;
}