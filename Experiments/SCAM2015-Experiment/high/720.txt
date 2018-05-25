import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Shapes {

    private List<Shape> shape = new ArrayList<Shape>();;

    public List<Shape> getShape() {
        return shape;
    }

    public void setShape(List<Shape> shape) {
        this.shape = shape;
    }

}