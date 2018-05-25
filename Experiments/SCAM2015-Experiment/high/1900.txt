String str = "100001111111111111111";

// add enough space for an additional "-" for every 8 chars:
char[] chars = new char[str.length() + (str.length() / 8)];

// this offset will give us the first "-" position from the LEFT:
int offset = str.length() % 8;
int idx = 0, strIdx = 0;

for (; strIdx < str.length(); idx++, strIdx++)
{
    if (((strIdx % 8) == offset) && (strIdx != 0))
        chars[idx++] = '-';
    chars[idx] = str.charAt(strIdx);
}

String str2 = new String(chars);

System.out.println(str2);