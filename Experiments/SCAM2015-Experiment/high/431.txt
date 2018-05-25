try 
{
    final String imageURL = "http://www.google.com/intl/en_ALL/images/logo.gif";
    URL url = (URL) AccessController.doPrivileged(new PrivilegedAction() 
    {

        public Object run() 
        {
            try
            {
                return new URL(imageURL);
            }
            catch (MalformedURLException e)
            {
                e.printStackTrace();
                return null;
            }

        }  
    });  

    if(url == null)
    {
         // Something is wrong notify the user
    }
    else
    {
         // We know the url is good so continue on
          img = ImageIO.read(url);
    }

} 
catch (IOException e) 
{
    System.out.println(e);
}