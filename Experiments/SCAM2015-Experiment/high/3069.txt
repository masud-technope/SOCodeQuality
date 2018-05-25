public class Agent {
  public static Object generateAgent() {
    Agent randomAgent = new Agent();//This creates an object on the HEAP
    //eliding everything else
    return randomAgent;//This returns the newly created object
  }
}