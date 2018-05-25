String s = "slash/prefix/dir1/dir2/dir3/dir4";

String prefix = "slash/prefix/";
String noPrefixStr = s.substring(s.indexOf(prefix) + prefix.length());

String[] tokens = noPrefixStr.split("/");

for (String t : tokens)
  System.out.println(t);