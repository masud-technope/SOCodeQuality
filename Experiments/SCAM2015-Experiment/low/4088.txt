public static void readEnvironment() throws IOException {

    List<Integer> all = new ArrayList<>();
    File file = new File("test.txt");
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    String s = br.readLine();

    while (s != null) {
        String[] data = s.split(";");
        //We know that the second part in a line is the amount for environment:
        int a = Integer.parseInt(data[2]);
        s = br.readLine();
        all.add(a);
    }
    br.close();

    int sum = 0;
    //Invoke the sum method:
    sum = sum(all, 0);
    System.out.println("Sum for environment: " + sum);
}