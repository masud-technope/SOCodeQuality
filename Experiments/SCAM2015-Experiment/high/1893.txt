try {
InetAddress thisIp =InetAddress.getLocalHost();
System.out.println("IP:"+thisIp.getHostAddress());
}
catch(Exception e) {
e.printStackTrace();
}