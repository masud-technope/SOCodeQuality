ExecutorService threads;
// ...
// Tell threads to finish off.
threads.shutdown();
// Wait for everything to finish.
while (!threads.awaitTermination(10, TimeUnit.SECONDS)) {
  log.info("Awaiting completion of threads.");
}