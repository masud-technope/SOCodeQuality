import java.io.FileInputStream;
import java.io.InputStream;
import javax.xml.stream.*;

public class ReadAndPrintXMLFileWithStAX {

    public static void main(String argv[]) throws Exception {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        InputStream in = new FileInputStream("book.xml");
        XMLStreamReader streamReader = inputFactory.createXMLStreamReader(in);
        streamReader.nextTag(); // Advance to "book" element
        streamReader.nextTag(); // Advance to "person" element

        int persons = 0;
        while (streamReader.hasNext()) {
            if (streamReader.isStartElement()) {
                switch (streamReader.getLocalName()) {
                case "first": {
                    System.out.print("First Name : ");
                    System.out.println(streamReader.getElementText());
                    break;
                }
                case "last": {
                    System.out.print("Last Name : ");
                    System.out.println(streamReader.getElementText());
                    break;
                }
                case "age": {
                    System.out.print("Age : ");
                    System.out.println(streamReader.getElementText());
                    break;
                }
                case "person" : {
                    persons ++;
                }
                }
            }
            streamReader.next();
        }
        System.out.print(persons);
        System.out.println(" persons");
    }

}