private static String getAccessToken(String refreshToken){

HttpClient client = new DefaultHttpClient();
HttpPost post = new HttpPost("https://accounts.google.com/o/oauth2/token");
try 
{
    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(4);
    nameValuePairs.add(new BasicNameValuePair("grant_type",    "refresh_token"));
    nameValuePairs.add(new BasicNameValuePair("client_id",     GOOGLE_CLIENT_ID));
    nameValuePairs.add(new BasicNameValuePair("client_secret", GOOGLE_CLIENT_SECRET));
    nameValuePairs.add(new BasicNameValuePair("refresh_token", refreshToken));
    post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

    org.apache.http.HttpResponse response = client.execute(post);
    BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
    StringBuffer buffer = new StringBuffer();
    for (String line = reader.readLine(); line != null; line = reader.readLine())
    {
        buffer.append(line);
    }

    JSONObject json = new JSONObject(buffer.toString());
    String accessToken = json.getString("access_token");

    return accessToken;

}
catch (IOException e) { e.printStackTrace(); }

return null;