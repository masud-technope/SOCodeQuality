try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(
    "http://java.com/applet/JreCurrentVersion2.txt").openStream()))) {
  String fullVersion = br.readLine();
  String version = fullVersion.split("_")[0];
  String revision = fullVersion.split("_")[1];
  System.out.println("Version " + version + " revision " + revision);
} catch (IOException e) {
  // handle properly
}