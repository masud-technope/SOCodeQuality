public final Singleton<Database> database = new Singleton<Database>() {
  @Override
  protected Database create() {
    // connect to the database, return the Database instance
  }
};

public final Singleton<LogCluster> logs = new Singleton<LogCluster>() {
  ...