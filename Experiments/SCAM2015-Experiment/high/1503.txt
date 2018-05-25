import java.text.SimpleDateFormat;
import java.util.Date;


public class DateIssue {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(sdf.format(new Date()));
    }
}