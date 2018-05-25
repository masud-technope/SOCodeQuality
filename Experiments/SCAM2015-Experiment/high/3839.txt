try
        {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        MainClass asg=new MainClass();
        System.out.println("How many numbers do you want in the array?");
        int l=Integer.parseInt(br.readLine());
        System.out.println("Enter the numbers");
        int[] a =new int[l];
        for(int i=0;i<l;i++) a[i]=Integer.parseInt(br.readLine());
        int[] b=asg.array(a);
        int newSize = 0;
        if(l% 2 == 0)
            newSize = l/2;
        else
            newSize = (l/2) +1;
        for(int j=0;j<newSize;j++) System.out.println(b[j]);
        }
        catch(Exception ex)
    {
        ex.printStackTrace();
    }


public int[] array(int[] a)
        {
            int l=a.length;
            int x=l-1;
            int newSize = 0;
            if(l% 2 == 0)
                newSize = l/2;
            else
                newSize = (l/2) +1;

            int[] b=new int[newSize];
            int i = 0;
            while(x >= 0)
                {
                    b[i]=a[x];
                    i++;
                    x -= 2;
                }

            return b;
         }