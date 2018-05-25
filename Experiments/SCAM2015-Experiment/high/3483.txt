public class DuplicateUsernameException
    extends Exception {
    public DuplicateUsernameException 
        (String username){....}
    public String requestedUsername(){...}
    public String[] availableNames(){...}
}