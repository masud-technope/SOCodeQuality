public static String fetchSourceHtml( String urlString ) {

  try {
    HttpClient httpClient = new HttpClient();
    GetMethod getMethod = new GetMethod( urlString );
    getMethod.setFollowRedirects( true );

    int httpStatus = httpClient.executeMethod( getMethod );

    if (httpStatus >= 400) {
      return "";
    }

    String sourceHtml = getMethod.getResponseBodyAsString();
    return sourceHtml;
  }
  catch (IOException e) {
    return "";
  }
}