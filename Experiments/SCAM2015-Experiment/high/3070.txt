public class DiscussionDirector {
  public void discuss() {
    Agent a = new Agent();//Here you create a new agent on the HEAP
    a.generateAgent();//And here you call into the Agent class to do the same thing
      //note that generateAgent returns an Object that you're 'forgetting' about.
    return;
  }
}