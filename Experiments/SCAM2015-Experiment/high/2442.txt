public class Author {

    private String auFname;
    private String auSname;
    private String auNational;

    public Author(String auFname, String auSname, String auNational) {
        this.auFname = auFname;
        this.auFname = auSname;
        this.auNational = auNational;
    }

    public String getAuFname() {
        return auFname;
    }

    public void setFirstName(String auFname) {
        this.auFname = auFname;
    }

    public String getAuSname() {
        return auSname;
    }

    public void setSecondName(String auSname) {
        this.auSname = auSname;
    }

    public String getAuNational() {
        return auNational;
    }

    public void setAuNational(String auNational) {
        this.auNational = auNational;
    }
}