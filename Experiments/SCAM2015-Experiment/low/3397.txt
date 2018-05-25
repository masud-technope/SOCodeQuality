import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

   public class Test {

      public static void main(String[] args) throws IOException, ParseException 
      { 
          String dateStr = "28 June 2009";
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
          System.out.println(sdf.format(new Date(dateStr)));
      }
   }