import javax.xml.bind.annotation.XmlAttribute;

public class Triangle extends Shape {
    private String triangleSpecificAttribute;

    @XmlAttribute(name="triangle-specific-attribute")
    public String getTriangleSpecificAttribute() {
        return triangleSpecificAttribute;
    }

    public void setTriangleSpecificAttribute(String t) {
        this.triangleSpecificAttribute = t;
    }

}