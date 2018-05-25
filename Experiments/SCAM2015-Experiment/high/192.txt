nixFileDataFlavor = new DataFlavor("text/uri-list;class=java.lang.String");
String data = (String)transferable.getTransferData(nixFileDataFlavor);
for(StringTokenizer st = new StringTokenizer(data, "\r\n"); st.hasMoreTokens();)
{
    String token = st.nextToken().trim();
    if(token.startsWith("#") || token.isEmpty())
    {
         // comment line, by RFC 2483
         continue;
    }
    try
    {
         File file = new File(new URI(token))
         // store this somewhere
    }
    catch(...)
    {
       // do something good
       ....
    }
}