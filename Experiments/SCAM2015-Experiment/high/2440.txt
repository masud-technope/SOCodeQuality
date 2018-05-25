public class BookTest {

    public static void main(String[] args) {

        Author fullAuth = new Author("Bob", "Marly", "Russian");
        Book bookInf = new Book("Alice", fullAuth, 60000, 2000);
        //Student studInf = new Student("Ted", "21/10/1992", "Male", "Simmonds Close 63", "King Close 65", "Computing", 12000);

        System.out.println(fullAuth.getAuNational() + " " + fullAuth.getAuFname());
        System.out.println(bookInf.getTitle() + " " + bookInf.getPrice());
        //System.out.println(studInf.getName() + " " + studInf.getName());


    }
}