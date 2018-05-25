String s = "2485083572085748";
int count = 0;
for (int i = 0, len = s.length(); i < len; i++) {
    if (Character.isDigit(s.charAt(i))) {
        count++;
    }
}