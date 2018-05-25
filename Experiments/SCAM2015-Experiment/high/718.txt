import javax.xml.bind.annotation.XmlAttribute;
import org.eclipse.persistence.oxm.annotations.XmlCustomizer;

@XmlCustomizer(ShapeCustomizer.class)
public abstract class Shape {

    int points;

    @XmlAttribute
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}