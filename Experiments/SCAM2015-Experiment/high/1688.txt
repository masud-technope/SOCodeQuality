@Entity(name="Email")
public class EmailLookup {
    /** Use this method to normalize email addresses for lookup */
    public static String normalize(String email) {
        return email.toLowerCase();
    }

    @Id String email;
    @Index long personId;

    public EmailLookup(String email, long personId) {
        this.email = normalize(email);
        this.personId = personId;
    }
}