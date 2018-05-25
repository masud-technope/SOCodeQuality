class Password {
    final String password; // the string to mask
    Password(String password) { this.password = password; } // needs null protection
    // allow this to be equal to any string
    // reconsider this approach if adding it to a map or something?
    public boolean equals(Object o) {
        return password.equals(o);
    }
    // we don't need anything special that the string doesnt
    public int hashCode() { return password.hashCode(); }
    // send stars if anyone asks to see the string - consider sending just
    // "******" instead of the length, that way you don't reveal the password's length
    // which might be protected information
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; < password.length(); i++) 
            sb.append("*");
        return sb.toString();
    }
}