Agent a1 = Agent.generateAgent();//sets a1 to the returned result of generateAgent()
  //this is an Agent object. 
Agent a2 = a1.generateAgent();//sets a2 to a DIFFERENT, new agent object
  //At this point there are two instances of Agent on the heap
  //This form of invocation is generally reserved for non-static methods
    //Usually a warning will be generated, too, by your IDE.