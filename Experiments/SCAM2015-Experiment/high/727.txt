import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Item {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");

        Iterator<String> iter = l.iterator();
        while(iter.hasNext())
        {
            String value = iter.next();
            if("1".equals(value))
            {
                iter.remove();
            }
            else
            {
                System.out.println(value);
            }
        }
    }
}