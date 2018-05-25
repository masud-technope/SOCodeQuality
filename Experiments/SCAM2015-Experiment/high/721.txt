import javax.xml.bind.annotation.XmlAttribute;

public class Square extends Shape {
    private String squareSpecificAttribute;

    @XmlAttribute(name="square-specific-attribute")
    public String getSquareSpecificAttribute() {
        return squareSpecificAttribute;
    }

    public void setSquareSpecificAttribute(String s) {
        this.squareSpecificAttribute = s;
    }

}