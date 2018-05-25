public class Client {

    //================================================================================
    // Properties
    //================================================================================

    private String name;
    private boolean checked;

    //================================================================================
    // Constructors
    //================================================================================

    public Client() {
    }

    public Client(String name, boolean checked) {
        this.name = name;
        this.checked = checked;
    }

    //================================================================================
    // Accessors
    //================================================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

}