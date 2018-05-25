StopWatch stopWatch = new StopWatch("My Stop Watch");

stopWatch.start("initializing");
Thread.sleep(2000); // simulated work
stopWatch.stop();

stopWatch.start("processing");
Thread.sleep(5000); // simulated work
stopWatch.stop();

stopWatch.start("finalizing");
Thread.sleep(3000); // simulated work
stopWatch.stop();

System.out.println(stopWatch.prettyPrint());