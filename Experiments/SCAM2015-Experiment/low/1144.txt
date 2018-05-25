Double firstnum;
boolean firstNumSigned = false;
if(match.find())
{
    firstNum = Double.parse(match.group(0));// Parsing handles possible sign in string. 
    //obv check for exceptions during this and double check group num
    String tmp = match.group(1);
    firstNumSigned = tmp.equals("+") || tmp.equals("-");
}
else
{//no match means the input was probably invalid....
    throw new IllegalArgumentException("What the heck were you thinking inputting that?!");
}
match = remainingPat.matcher(inputString);//use our other pattern for remaining numbers
if(firstNumSigned)
{
    match.find();//a signed first number will cause success here, we need to ignore this since we already got the first number
}
Double tmpRemaingingNum;
String operation;
while(match.find())
{
    operation = match.group(1);
    tmpRemainingNum = Double.parse(match.group(2));
    //Do what you want with these values now until match.find() returns false and you are done
}