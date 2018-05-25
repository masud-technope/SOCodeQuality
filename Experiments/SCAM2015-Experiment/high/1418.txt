String temp = Integer.toString(guess);
int[] newGuess = new int[temp.length()];
for (int i = 0; i < temp.length(); i++)
{
    newGuess[i] = temp.charAt(i) - '0';
}