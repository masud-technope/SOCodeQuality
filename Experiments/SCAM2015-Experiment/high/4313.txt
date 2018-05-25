for (int i = 0; i < answers[0].length; i++) {
    int letterA = 0;
    for (int j = 0; j < answers.length; j++) {
        System.out.print(j + "" + i + " ");
        if (answers[j][i] == 'A') {
            letterA++;
        }
    }
    System.out.println("Number of A in column " + i + " is " + letterA);
}