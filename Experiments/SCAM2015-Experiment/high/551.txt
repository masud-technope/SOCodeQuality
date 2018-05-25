private static class SingletonObjectFactoryHolder{
    private static final ObjectFactory INSTANCE;
    static {
        try {
            INSTANCE = new ObjectFactory();
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}