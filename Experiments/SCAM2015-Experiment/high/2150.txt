String inputString = "1, \"John\",\"Joy, John\"";
    char quote = '"';
    List<String> csvList = new ArrayList<String>();
    boolean inQuote = false;
    int lastStart = 0;
    for (int i = 0; i < inputString.length(); i++) {
        if ((i + 1) == inputString.length()) {
            //if this is the last character
            csvList.add(inputString.substring(lastStart, i + 1));
        }
        if (inputString.charAt(i) == quote) {
            //if the character is quote
            if (inQuote) {
                inQuote = false;
                continue; //escape
            }
            inQuote = true;
            continue;
        }
        if (inputString.charAt(i) == ',') {
            if (inQuote) continue;
            csvList.add(inputString.substring(lastStart, i));
            lastStart = i + 1;
        }
    }
    System.out.println(csvList);