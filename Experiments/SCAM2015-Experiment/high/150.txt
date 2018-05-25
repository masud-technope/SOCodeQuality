ArrayList<String> list = new ArrayList<String>();
list.add("one");
list.add("two");
list.add("three");

StringBuilder sb = new StringBuilder();
for (String s : list)
{
    sb.append(s);
    sb.append("\t");
}

System.out.println(sb.toString());