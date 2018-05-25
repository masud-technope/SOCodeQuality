String msg = "";
byte ch;
while((ch=mInStream.read())!='#') {
    bytes++;
    msg+=ch;
}