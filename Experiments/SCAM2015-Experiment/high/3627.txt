public SessionFactory provideSessionFactory(MyConfiguration configuration,
                                            Environment environment) {

    SessionFactory sf = hibernateBundle.getSessionFactory();
    if (sf == null) {
        try {
            hibernateBundle.run(configuration, environment);
            return hibernateBundle.getSessionFactory();
        } catch (Exception e) {
            logger.error("Unable to run hibernatebundle");
        }
    } else {
        return sf;
    }
}