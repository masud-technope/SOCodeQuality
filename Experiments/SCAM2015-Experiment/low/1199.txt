import java.util.*;
import java.lang.*;

class Main
{
        public static void main (String[] args)
        {
                String hex = "9e";
                int i = Integer.parseInt(hex, 16);
                System.out.println(Arrays.toString(intToBytes(i)));
        }

        private static byte[] intToBytes(int n) 
        {
                byte[] bytes = new byte[4];
                for(int i = 0; i < 4; i++)
                {
                        bytes[i] = (byte) (n | 0);
                        n >>= 8;
                }
                return bytes;
        }
}