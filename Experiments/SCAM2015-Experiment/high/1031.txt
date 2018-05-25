/**
 * Gets a string representing the pid of this program - Java VM
 */
public static String getPid() throws IOException,InterruptedException {

  Vector<String> commands=new Vector<String>();
  commands.add("/bin/bash");
  commands.add("-c");
  commands.add("echo $PPID");
  ProcessBuilder pb=new ProcessBuilder(commands);

  Process pr=pb.start();
  pr.waitFor();
  if (pr.exitValue()==0) {
    BufferedReader outReader=new BufferedReader(new InputStreamReader(pr.getInputStream()));
    return outReader.readLine().trim();
  } else {
    System.out.println("Error while getting PID");
    return "";
  }
}