try{
        URL url = new URL("http://example.com/someParams/SOME-ACCESS-TOKEN");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Language", "en-US");
        connection.setRequestProperty("X-EXAMPLE-LOGIN", "XXXXXXXX");
        connection.setRequestProperty("X-EXAMPLE-PASSWORD", "XXXXXX");
        connection.setUseCaches(false);
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setConnectTimeout(99999999);
        connection.setReadTimeout(99999999);
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        //DataInputStream input = new DataInputStream(connection.getInputStream());
        String  ret = "";
       /*   if(in!=null){
            for( int c = input.read(); c != -1; c = input.read() ) {
                ret = ret + String.valueOf((char)c);
                if(input==null || connection==null)
                    break;
            }
       }*/
       String inputLine;
       while ((inputLine = in.readLine()) != null) 
       {
            ret = ret + inputLine;
       }
       if(in!=null)
         in.close();
       if(connection!=null)
         connection.disconnect();
       if(ret!=null && ret.length()>0){
           return ret;
       }

   }catch(Exception e) {
      e.printStackTrace();
   }