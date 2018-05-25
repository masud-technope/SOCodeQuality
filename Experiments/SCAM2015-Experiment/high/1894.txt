import java.net.*;
import java.util.*;

public class Test
{
    public static void main(String[] args)
        throws Exception // Just for simplicity
    {
        for (Enumeration<NetworkInterface> ifaces = 
               NetworkInterface.getNetworkInterfaces();
             ifaces.hasMoreElements(); )
        {
            NetworkInterface iface = ifaces.nextElement();
            System.out.println(iface.getName() + ":");
            for (Enumeration<InetAddress> addresses =
                   iface.getInetAddresses();
                 addresses.hasMoreElements(); )
            {
                InetAddress address = addresses.nextElement();
                System.out.println("  " + address);
            }
        }
    }
}