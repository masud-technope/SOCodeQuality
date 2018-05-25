String  ret = "";
    if(input!=null){
        for( int c = input.read(); c != -1; c = input.read() ) { //InterfaceHelper.java:695
            ret = ret + String.valueOf((char)c);
        }
    }