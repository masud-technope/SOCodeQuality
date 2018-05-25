public class Test {
    public static void main(String[] args) throws URISyntaxException,
            MalformedURLException {
        URLBuilder urlb = new URLBuilder("www.example.com");
        urlb.setConnectionType("http");
        urlb.addSubfolder("somesub");
        urlb.addSubfolder("anothersub");
        urlb.addParameter("param lol", "unknown");
        urlb.addParameter("paramY", "known");
        String url = urlb.getURL();
        System.out.println(url);


        urlb = new URLBuilder();
        urlb.addSubfolder("servlet");
        urlb.addSubfolder("jsp");
        urlb.addSubfolder("somesub");
        urlb.addSubfolder("anothersub");
        urlb.addParameter("param lol", "unknown");
        urlb.addParameter("paramY", "known");
        String relUrl = urlb.getRelativeURL();
        System.out.println(relUrl);
    }
}

class URLBuilder {
    private StringBuilder folders, params;
    private String connType, host;

    void setConnectionType(String conn) {
        connType = conn;
    }

    URLBuilder(){
        folders = new StringBuilder();
        params = new StringBuilder();
    }

    URLBuilder(String host) {
        this();
        this.host = host;
    }

    void addSubfolder(String folder) {
        folders.append("/");
        folders.append(folder);
    }

    void addParameter(String parameter, String value) {
        if(params.toString().length() > 0){params.append("&");}
        params.append(parameter);
        params.append("=");
        params.append(value);
    }

    String getURL() throws URISyntaxException, MalformedURLException {
        URI uri = new URI(connType, host, folders.toString(),
                params.toString(), null);
        return uri.toURL().toString();
    }

    String getRelativeURL() throws URISyntaxException, MalformedURLException{
        URI uri = new URI(null, null, folders.toString(), params.toString(), null);
        return uri.toString();
    }
}