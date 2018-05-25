InetAddress addr = InetAddress.getLocalHost();
byte[] ipaddr = addr.getAddress();
if (ipaddr.length == 4) {
  int hostid = 0 | ipaddr[1] << 24 | ipaddr[0] << 16 | ipaddr[3] << 8 | ipaddr[2];
  StringBuilder sb = new StringBuilder();
  Formatter formatter = new Formatter(sb, Locale.US);
  formatter.format("%08x", hostid);
  System.out.println(sb.toString());
} else {
  throw new Exception("hostid for IPv6 addresses not implemented yet");
}