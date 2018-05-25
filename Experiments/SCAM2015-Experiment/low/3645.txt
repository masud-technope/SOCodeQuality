public class Cougar extends Feline {
    public String type = "c "; // <-- shadow Feline's type.
    public void hh() {
        super.hh();
        // this.type = "c ";
        System.out.print("CCCCC " + this.type + super.type);
    }
}