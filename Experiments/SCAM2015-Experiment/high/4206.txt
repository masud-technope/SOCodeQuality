class ProduceCosumeData
{
    boolean flag;
    public synchronized void printStringP(int n)
    {
        for(int i=0;i<n;i++)
        {
            try{
                while (flag == true) {   
                    wait();
                }
                flag=true;
                System.out.print("Pay");
                notify();
            }catch(Exception e)
            {
                System.out.print(e);
            }
        }
    }
    public synchronized void printStringC(int n)
    {
        for(int i=0;i<n;i++)
        {
            try{
                while(flag == false) {
                    wait();
                }
                System.out.print("Tm");
                flag = false;
                notify();
            }catch(Exception e)
            {
                System.out.print(e);
            }
        }
    }
}