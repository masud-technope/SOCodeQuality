public interface RemoteAction {
  public void execute(Client client) throws RemoteException;
}

public void doAll(RemoteAction action) {
  for (Map.Entry<String,Client> entry : clients.entrySet()) {
    if (!"mod".equals(entry.getKey())) {
      try {
        action.execute(entry.getValue());
      } catch(RemoteException ex) {
        // do something
      }
    }
  }
}

public void methodX (final arg1, final arg2) {
  doAll(new Action() {
    @Override public void execute(Client client) throws RemoteException {
      client.methodX(arg1, arg2);
    }
  });
}

public void methodY (final arg1, final arg2, final arg3) {
  doAll(new Action() {
    @Override public void execute(Client client) throws RemoteException {
      client.methodY(arg1, arg2, arg3);
    }
  });
}