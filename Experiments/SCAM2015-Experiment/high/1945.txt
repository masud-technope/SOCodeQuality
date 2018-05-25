void sort() {
boolean doMore;
do {
    doMore = false;
    for(int i = 0; i < guesses.length - 1; i++) {
        if(guesses[i] > guesses[i+1]) {
            char temp = guesses[i];
            guesses[i] = guesses[i+1];
            guesses[i+1] = temp;

            doMore = true;
        }
    }
} while (doMore);