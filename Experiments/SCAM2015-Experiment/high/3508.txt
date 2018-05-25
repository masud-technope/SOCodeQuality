public static String getPath(String url){
        if(url.contains("://")){
            url = url.substring(url.indexOf("://")+3);
            url = url.substring(url.indexOf("/") + 1);
        } else {
            url = url.substring(url.indexOf("/")+1);
        }
        return url;
    }