for (int i = 0; i < answers.length; i++) {
      int letterA=0;
        for (int j = 0; j < answers[i].length; j++) {
            if (answers[j][i] == 'A') {
                letterA++;
            }
        }
       System.out.println("Number of A in column "+i+" is "+letterA);
    }