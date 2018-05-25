Pattern p = Pattern.compile("\\bthe\\b", Pattern.CASE_INSENSITIVE);

while ( (line = bf.readLine()) != null) {
    linecount++;

    Matcher m = p.matcher(line);

    // indicate all matches on the line
    while (m.find()) {
        System.out.println("Word was found at position " + 
                       m.start() + " on line " + linecount);
    }
}