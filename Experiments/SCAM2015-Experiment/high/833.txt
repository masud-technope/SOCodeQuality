public void askForAnAnswer() throws TimeoutException, InterruptedException, ExecutionException
{
  Future<String> theAnswerF = getMeAnAnswer();
  String theAnswer = theAnswerF.get();

}

public Future<String> getMeAnAnswer()
{
  Future<String> promise = null;
  // spin off thread/executor, whatever.
  SwingUtilities.invokeAndWait(new Runnable() {
  public void run() {
    host = JOptionPane.showInputDialog("Enter host name: ");
  }
 });
 // ... to wrap a Future around this.

  return promise;
}