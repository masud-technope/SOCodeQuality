Process p = null;
try {
    List<String> cmd = new LinkedList<String>();
    cmd.add("executable");
    cmd.add("-arg1");
    cmd.add("value1");
    cmd.add("-arg2");
    ProcessBuilder pb = new ProcessBuilder(cmd);
    pb.redirectErrorStream(true);
    p = pb.start();
    BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
    while (input.ready()) {
        String line = input.readLine();
        System.out.println("From process: "+line);
    }
    input.close();
} catch (IOException e) {
    this.logMessage("IOException caught: "+e.getMessage());
    e.printStackTrace();
}