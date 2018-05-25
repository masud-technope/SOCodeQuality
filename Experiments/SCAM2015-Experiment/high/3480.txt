public static String doSomeMagic(String s) {
    if (!s.isEmpty()) {
        StringBuffer sb = new StringBuffer();
        return sb.append(s.replaceAll("(\\S)", "$1$1"))
                 .append("\n")
                 .append(doSomeMagic( s.replaceAll(".$", "") )
                 .toString();
    }
    return "";
}