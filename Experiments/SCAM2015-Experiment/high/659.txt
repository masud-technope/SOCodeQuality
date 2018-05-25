try {
    // Create a URL for the desired page
    URL url = new URL("http://hostname:80/index.html");

    // Read all the text returned by the server
    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
    String str;
    while ((str = in.readLine()) != null) {
        // str is one line of text; readLine() strips the newline character(s)
    }
    in.close();
} catch (MalformedURLException e) {
} catch (IOException e) {
}