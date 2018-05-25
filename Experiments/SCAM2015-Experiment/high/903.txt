public class Config {

    private static final Properties PROPERTIES = new Properties();

    static {
        try {
            PROPERTIES.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("Loading config file failed.", e);
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    // ...
}