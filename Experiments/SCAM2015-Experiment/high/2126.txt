import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;


public class StringArrayRepresentationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException, DecoderException {

        String[] strs = new String[] {"test 1", "test 2", "test 3"};


        long t = System.currentTimeMillis();
        for (int i =0; i < 100000;i++) {
            stringManipulation(strs);
        }
        System.out.println("String manipulation: " + (System.currentTimeMillis() - t));


        t = System.currentTimeMillis();
        for (int i =0; i < 100000;i++) {
            testHex(strs);
        }
        System.out.println("Hex: " + (System.currentTimeMillis() - t));


        t = System.currentTimeMillis();
        for (int i =0; i < 100000;i++) {
            testBase64(strs);
        }
        System.out.println("Base64: " + (System.currentTimeMillis() - t));
    }

    public static void stringManipulation(String[] strs) {
        String result = serialize(strs);
        unserialize(result);
    }

    private static String[] unserialize(String result) {
        int sizesSplitPoint = result.toString().lastIndexOf('$');
        String sizes = result.substring(sizesSplitPoint+1);
        StringTokenizer st = new StringTokenizer(sizes, ";");
        String[] resultArray = new String[st.countTokens()];

        int i = 0;
        int lastPosition = 0;
        while (st.hasMoreTokens()) {
            String stringLengthStr = st.nextToken();
            int stringLength = Integer.parseInt(stringLengthStr);
            resultArray[i++] = result.substring(lastPosition, lastPosition + stringLength);
            lastPosition += stringLength;
        }
        return resultArray;
    }

    private static String serialize(String[] strs) {
        StringBuilder sizes = new StringBuilder("$");
        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            if (sizes.length() != 1) {
                sizes.append(';');
            }
            sizes.append(str.length());
            result.append(str);
        }

        result.append(sizes.toString());
        return result.toString();
    }

    public static void testBase64(String[] strs) throws IOException, ClassNotFoundException, DecoderException {
        // serialize
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new ObjectOutputStream(out).writeObject(strs);

        // your string
        String yourString = new String(Base64.encodeBase64(out.toByteArray()));

        // deserialize
        ByteArrayInputStream in = new ByteArrayInputStream(Base64.decodeBase64(yourString.getBytes()));
    }

    public static void testHex(String[] strs) throws IOException, ClassNotFoundException, DecoderException {
        // serialize
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new ObjectOutputStream(out).writeObject(strs);

        // your string
        String yourString = new String(Hex.encodeHex(out.toByteArray()));

        // deserialize
        ByteArrayInputStream in = new ByteArrayInputStream(Hex.decodeHex(yourString.toCharArray()));
    }

}