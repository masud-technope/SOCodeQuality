public class Master {
    static boolean initialised=false;
    static int[] keyPara;
    static int[] otherPara;

    public void doTask() {
        if (!initialised)
        {
            boolean filefound=false;
            // put here code to check if your saved file exists
            if(filefound)
            {
               loadkeyfile();
               calcOtherPara();
               initialised=true;
               doAutomatedTask();
            } else {
               doGuidedTask();
               saveKeyPara();
               calcOtherPara();
               initialised=true;
            }
        } else {
            doAutomatedTask();
        }
    } 
    private void doAutomatedTask() {
       // put your non-interactive version here
    }
}