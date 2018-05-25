StringBuilder str = new StringBuilder("100001111111111111111");
int idx = str.length() - 8;

while (idx > 0)
{
    str.insert(idx, "-");
    idx = idx - 8;
}

System.out.println(str.toString());