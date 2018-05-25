class Hangman {
    final String word;
    final BitSet revealed;
    public Hangman(String word) {
        this.word = word;
        this.revealed = new BitSet(word.length());
        reveal(' ');
        reveal('-');
    }
    public void reveal(char c) {
        for(int i = 0; i < word.length; i++) {
            if(word.charAt(i) == c) revealed.set(i);
        }
    }
    public boolean solve(String guess) {
        return word.equals(guess);
    }
    public String toString() {
         StringBuilder sb = new StringBuilder(word.length());
         for(int i = 0; i < word.length; i++) {
             char c = revealed.isSet(i) ? word.charAt(i) : "*";
         }
         return sb.toString();
    }
}