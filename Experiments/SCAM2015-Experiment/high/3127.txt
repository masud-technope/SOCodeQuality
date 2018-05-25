String regex = "(?i)%s\\s+([\\S]+)\\s+([\\S]+)";
Matcher m = Pattern.compile(String.format(regex, Pattern.quote(keyword))).matcher(str);

while (m.find())
{
    System.out.println(m.group(1));
    System.out.println(m.group(2));
}