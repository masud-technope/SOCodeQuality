Scanner input=new Scanner(System.in);

    String firstInput=input.nextLine().charAt(0) + "";
    //ensure its lower case
    firstInput=firstInput.toLowerCase();
    String secondInput=input.nextLine();
    //ensure char in secondInput is lower cased too.
    secondInput=secondInput.replaceAll(firstInput.toUpperCase(),firstInput);

    String[] splitted=secondInput.split(firstInput);

    String output="";
    int current=0;
    for(int i=0;i<splitted.length;i++){
        String s=splitted[i];
        current=current+ s.length();
        if(i==splitted.length-1){
            output=output+s;
        }else{
            output=output+s;
            output=output+ current;
            current++;
        }
    }
    //edited part, as split doesn't split if firstinput is the last character of the string
    if(secondInput.endsWith(firstInput)){
        output=output+secondInput.length();
    }


    System.out.println(output);