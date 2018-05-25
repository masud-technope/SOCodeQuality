int colIndex = 0;
    int letterA = 0;
    for (int j = 0; j < answers[i].length; j++) {
        if (answers[j][colIndex] == 'A') {
            letterA++;
        }
    }
    System.out.println("Number of A in column " + colIndex + " is " + letterA);