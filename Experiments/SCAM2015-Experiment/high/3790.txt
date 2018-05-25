class PrePostIncrement
{
    public static void main(String args[])
    {
        for (int j=0; j<3; j++)
        {
            for (int i=0; i<5; i++)
            {
                long before = System.nanoTime();
                runPreIncrement();
                long after = System.nanoTime();
                System.out.println("pre  : "+(after-before)/1e6);
            }
            for (int i=0; i<5; i++)
            {
                long before = System.nanoTime();
                runPostIncrement();
                long after = System.nanoTime();
                System.out.println("post : "+(after-before)/1e6);
            }
        }
    }

    private static void runPreIncrement()
    {
        final int n = Integer.MAX_VALUE;
        int i = 0;
        while (++i < n) {}
    }

    private static void runPostIncrement()
    {
        final int n = Integer.MAX_VALUE;
        int i = 0;
        while (i++ < n) {}
    }
}