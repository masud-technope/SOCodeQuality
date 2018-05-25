String s = "\"xxx\"|\"yyy|bar\"|\"zzz\"|\"nn\n" + 
        "n\"|\"....\"";
Matcher m = Pattern.compile("(?s)\".*?\"").matcher(s);
while(m.find())
{
        System.out.println(m.group(0));
}