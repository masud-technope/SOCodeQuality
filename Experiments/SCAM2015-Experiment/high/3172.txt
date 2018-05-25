private Properties testProperties = null;

public String getproperties(String property)
    if (testProperties == null) {
        InputStream inputStream = new ClassPathResource("test.properties").getInputStream();
        testProperties = new Properties();
        testProperties.load(inputStream);
        inputStream.close();
    }
    return testProperties.getProperty(propertyType);
}