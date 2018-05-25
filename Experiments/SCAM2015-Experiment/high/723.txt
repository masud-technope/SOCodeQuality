import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Demo {

    public static void main(String[] args) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Shapes.class, Triangle.class, Square.class);

        StringReader xml = new StringReader("<shapes><shape square-specific-attribute='square stuff' type='square'><points>4</points></shape><shape triangle-specific-attribute='triangle stuff' type='triangle'><points>3</points></shape></shapes>");
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Shapes root = (Shapes) unmarshaller.unmarshal(xml);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(root, System.out);
    }
}