int ch;

//read bytes from ByteArrayInputStream using read method
while((ch = binaryStream.read()) != -1)
{
   System.out.print((char)ch);
   // store it to an array...
}