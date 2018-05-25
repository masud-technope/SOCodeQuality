@Entity
public class Foobar implements Serializable {

    // You might have some other id
    @Id
    private Long id;

    @ElementCollection
    private List<String> uuids;

    // Getters/Setters, serialVersionUID, ...

}