public class Job {
  private static final AtomicInteger count = new AtomicInteger(0); 
  private final int jobID;
  private final String name;

  private boolean isFilled;

  public Job(String title){
    name = title;
    isFilled = false;
    jobID = count.incrementAndGet(); 
}