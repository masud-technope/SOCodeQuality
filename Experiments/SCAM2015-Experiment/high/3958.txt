Scanner input = new Scanner(System.in);
        String s;
        ArrayList<Double> numbers= new ArrayList<>();
        System.out.print("Please enter number: ");           
        s=input.nextLine();
        String [] strnum = s.split("\\s+");

        int j=0;
        while(j<strnum.length){
            numbers.add(Double.parseDouble(strnum[j++]));
        }   
        for (Double n : numbers)
            System.out.println(n);