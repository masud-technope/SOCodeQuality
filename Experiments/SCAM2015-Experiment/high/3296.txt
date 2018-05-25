String input = "SrcAddr: 0.0.21.201\n"+
           "DstAddr: 7.202.10.100\n"+
           "NextHop: 0.33.189.142\n"+
           "InputIf: 19\n"+
           "OutputIf: 50715"; 

String SrcAddr=getMatchedString("SrcAddr",input);
String NextHop=getMatchedString("NextHop",input);
String InputIf=getMatchedString("InputIf",input);
String OutputIf=getMatchedString("OutputIf",input);

System.out.println(SrcAddr);
System.out.println(NextHop);
System.out.println(InputIf);
System.out.println(OutputIf);  

 ..........

 public static String getMatchedString(String word,String input){

     String REGEX = "(?:"+word+":)\\s(.*)";
     Pattern p = Pattern.compile(REGEX);
     Matcher m = p.matcher(input);
     if (m.find()) {
        String matched = m.group(1);
        return matched;
     }
     return null;

 }