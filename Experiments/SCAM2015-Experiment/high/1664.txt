public class Helper
{
    public static Map<String,String> getMap()
    {
         return HelperDelegate.map;
    }

    private static class HelperDelegate { 
           private static Map<String,String> map = new HashMap<String,String>();
           static{
                 //load some stuff
           } 

    }
}