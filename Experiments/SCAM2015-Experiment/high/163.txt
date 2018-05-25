public void doAll(arg1, arg2, arg3) {
  for (Map.Entry<String,Client> entry : clients.entrySet()) {
    if (!"mod".equals(entry.getKey())) {
      try {
        switch(MESSAGE_TYPE) {
          case METHODX:
            entry.getValue().methodXX(arg1, arg2);
            break;
          case METHODY:
            entry.getValue().methodYY(arg1, arg2, arg3);
            break;
        }
      } catch(RemoteException ex) {
        // do something
      }
    }
  }
}