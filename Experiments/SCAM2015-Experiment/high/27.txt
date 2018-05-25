boolean stopFlag = false;
Object[] latestArgs = null;

public void run() {
  while (!stopFlag) {
    if (latestArgs != null) {
      Object[] args = latestArgs;
      latestArgs = null;
      perform3dUpdate(args);
    } else {
      Thread.sleep(500);
    }
  }
}

public void endThread() {
  stopFlag = true;
}

public void updateSettings(Object[] args) {
  latestArgs = args;
}