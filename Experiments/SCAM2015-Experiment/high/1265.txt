protected <T> T getProperty(String key, T fallback, Class<T> clazz) {
    String value = properties.getProperty(key);

    if (value == null) {
        return fallback;
    } else {

        //try getting Constructor
        Constructor<T> constructor;
        try {
            constructor = clazz.getConstructor(new Class<?>[] { String.class });
        }
        catch (NoSuchMethodException nsme) {
            //handle constructor not being found
        }

        //try instantiating and returning
        try {
            return constructor.newInstance(value);
        }
        catch (InstantiationException ie) {
            //handle InstantiationException
        }
        catch (IllegalAccessException iae) {
            //handle IllegalAccessException
        }
        catch (InvocationTargetException ite) {
            //handle InvocationTargetException
        }
    }
}