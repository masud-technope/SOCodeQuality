ArrayList<String> list = new ArrayList<String>();
list.add("one");
list.add("two");
list.add("three");

String listString = "";

for (String s : list)
{
    listString += s + "\t";
}

System.out.println(listString);