private Database database;

public synchronized Database getDatabase() {
  if (database == null) {
    // connect to the database, assign the database field
  }
  return database;
}

private LogCluster logs;

public synchronized LogCluster getLogs() {
  ...