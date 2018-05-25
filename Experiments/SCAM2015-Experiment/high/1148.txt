String filename = ...
br = new BufferedReader( new FileInputStream(filename));
while (true) {
   String l = "";
   Char c = " ";
   while (true){
        c = br.read();
        if not c == "\n"{
            // do stuff, not sure what you want with the endl encoding
            // break to return endl-free line
        }
        if not c == "\r"{
            // do stuff, not sure what you want with the endl encoding
            // break to return endl-free line
            Char ctwo = ' '
            ctwo = br.read();
            if ctwo == "\n"{
                // do extra stuff since you know that you've got a \r\n
            }
        }
        else{
            l = l + c;
        }
   if (l == null) break;
   ...
   l = "";
}