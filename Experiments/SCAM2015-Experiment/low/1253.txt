private void getQuestion() {
    res = getResources();
    qString = res.getStringArray(R.array.questions);
    arrayLength = qString.length;
    qTotal = arrayLength;

}

private void getRandom() {
    rnd = rgenerator.nextInt(arrayLength);
    rQuestion = qString[rnd];
    qString[rnd] = "used";
    seperate();

}

private void seperate() {
    if (rQuestion != "used") {
        tokens = new StringTokenizer(rQuestion, ":");
        wordCount = tokens.countTokens();
        sep = new String[wordCount];
        wArray = 0;
        while (tokens.hasMoreTokens()) {
            sep[wArray] = tokens.nextToken();
            wArray++;
        }
        qNumber++;
    } else {
        if (qNumber < qTotal) {
            getRandom();
        } else {
            startActivity(new Intent("com.example.END"));
        }
    }

}