package so3950354;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ServerManager {

  private final ConcurrentMap<Server, Long> lastActive = new ConcurrentHashMap<Server, Long>();

  /** May be overridden by a special method for testing. */
  protected long now() {
    return System.currentTimeMillis();
  }

  public void markActive(Server server) {
    lastActive.put(server, Long.valueOf(now()));
  }

  public void removeInactive(long timeoutMillis) {
    final long now = now();

    Iterator<Map.Entry<Server, Long>> it = lastActive.entrySet().iterator();
    while (it.hasNext()) {
      final Map.Entry<Server, Long> entry = it.next();
      final long backThen = entry.getValue().longValue();
      /*
       * Even if some other code updates the timestamp of this server now,
       * the server had timed out at some point in time, so it may be
       * removed. It's bad luck, but impossible to avoid.
       */
      if (now - backThen >= timeoutMillis) {
        it.remove();
      }
    }
  }

  static class Server {

  }
}