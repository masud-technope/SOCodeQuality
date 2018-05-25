HttpClient client = new DefaultHttpClient();
        // Perform a GET request for a JSON list
        HttpUriRequest request = new HttpGet("https://somejson.json");
        // Get the response that sends back
        HttpResponse response = null;
        try {
            response = client.execute(request);
        } catch (ClientProtocolException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }