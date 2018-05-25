private final HibernateBundle<MyConfiguration> hibernateBundle =
        new HibernateBundle<MyConfiguration>(MyModel.class) {
            @Override
            public DataSourceFactory getDataSourceFactory(MyConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        };

@Provides
public SessionFactory provideSessionFactory(MyConfiguration configuration,
                                            Environment environment) {

    SessionFactory sf = hibernateBundle.getSessionFactory();
    if (sf == null) {
        try {
            hibernateBundle.run(configuration, environment);
        } catch (Exception e) {
            logger.error("Unable to run hibernatebundle");
        }
    }

    return hibernateBundle.getSessionFactory();
}