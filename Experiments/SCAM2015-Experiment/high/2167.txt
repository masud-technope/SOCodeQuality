package test.t100.t001;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListSpeed {

    public static String[] PREFIX = {"Dark ", "Light ", "Plain "};
    public static String[] COLOR = {"Red", "Green", "Blue"};

    public static String getColor(Random r) {
        int val = r.nextInt(COLOR.length);
        return COLOR[val];
    }

    public static String getPrefix(Random r) {
        int val = r.nextInt(PREFIX.length);
        return PREFIX[val];
    }

    public static int countPrefixes(ArrayList<String> list, String prefix) {
        int count = 0;
        for (String val : list) {
            if (val.toLowerCase().startsWith(prefix.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        ArrayList<String> list = new ArrayList<String>();
        Random r = new Random();
        logger.log(Level.INFO, "Creating entries.");
        for (int ii=0; ii<1000000; ii++) {
            list.add( getPrefix(r) + getColor(r) );
        }
        logger.log(Level.INFO, "Searching..");
        logger.log(Level.INFO, 
                "Searching 'dark' " + countPrefixes(list,"dark"));
        logger.log(Level.INFO, 
                "Searching 'light' " + countPrefixes(list,"light"));
        logger.log(Level.INFO, 
                "Searching 'plain' " + countPrefixes(list,"plain"));
    } 
}