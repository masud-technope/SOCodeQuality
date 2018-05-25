public class Main {

    private static String GOOGLE_TRANSLATE_URL = "https://www.googleapis.com/language/translate/v2";
    private static String GOOGLE_API_KEY = "xxxx";

    private static String translateString(String sourceString, String sourceLanguage, String targetLanguage) {

        String response = null;

        // prepare call
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(GOOGLE_TRANSLATE_URL+"?q="+sourceString+"&source="+sourceLanguage+"&target="+targetLanguage+"&key="+GOOGLE_API_KEY);
        post.setHeader("X-HTTP-Method-Override", "GET");

        try {

            // make the call
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            response = client.execute(post, responseHandler);

        } catch (IOException e) {
            // todo: proper error handling
        }

        return response;
    }

    public static void main(String[] args) {
        System.out.println(translateString("hello", "en", "sv"));
    }

}