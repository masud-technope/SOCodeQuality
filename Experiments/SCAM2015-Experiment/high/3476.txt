String regex = "<=|<|>=|>|==|=|\\+|-";

String line = "a <= b < c ";

Matcher matcher = Pattern.compile(regex).matcher(line);

while (matcher.find()) {
    System.out.println(matcher.start() + " : " + matcher.group());
}