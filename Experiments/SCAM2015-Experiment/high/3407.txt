HashMap<String, Integer> mapOfWords = new HashMap<String, Integer>();

      while (file.hasNextLine()) {
        String s = file.nextLine(); 
        String[] words = s.split("\\s");
        int count;
        for (String word : words) {
           if (mapOfWords.get(word) == null) {
              mapOfWords.put(word, 1);
           }
           else {
              count = mapOfWord.get(word);
              mapOfWords.put(word, count + 1);
           }
        }
      }