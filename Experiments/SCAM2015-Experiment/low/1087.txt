public void getRestfullMethod(...) throws IOException
  {
        String temp = null;

        //Build the request data.
        StringBuffer buf = new StringBuffer (..)
        buf.append("&system=").append ("someVal");

        String urlStr = buf.toString ();

        //Send the request.
        URL url = new URL (urlStr);
      URLConnection con = url.openConnection();

      //Return the response.
        BufferedReader in = new BufferedReader (new InputStreamReader (con.getInputStream ()));
        String inputLine = null;

        buf = new StringBuffer ();
        while ((inputLine = in.readLine ()) != null)
              buf.append (inputLine);
        in.close ();

  }