Try {
    String message = null;
    HttpClient httpclient = new DefaultHttpClient(); 
    JSONParser parser = new JSONParser();

    String url = "working - url";
    HttpResponse response = null;
    response = httpclient.execute(new HttpGet(url));

    JSONObject json_data = null;
    json_data = (JSONObject)parser.parse(EntityUtils.toString(response.getEntity()));
    JSONArray results = (JSONArray)json_data.get("result");
    for (Object queid : results) {
        message = message.concat((String) ((JSONObject)queid).get("id"));
        message = message.concat("\t");
        message = message.concat((String) ((JSONObject)queid).get("owner"));
        message = message.concat("\n");
    }
} catch (Exception e) {
    e.printStack();
}