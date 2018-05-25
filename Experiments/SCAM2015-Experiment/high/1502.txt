String i = "[ hello, char[]={a,b,c} ... bye ]";

int indexOfOpenBracket = i.indexOf("[");
int indexOfLastBracket = i.lastIndexOf("]");

System.out.println(i.substring(indexOfOpenBracket+1, indexOfLastBracket));