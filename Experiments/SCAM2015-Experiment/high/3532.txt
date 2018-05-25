import java.util.ArrayList;
import java.util.List;

public class DifferentForLoops
{
    public static void main(String[] args)
    {
        DifferentForLoops d = new DifferentForLoops();
        d.startOld();
        d.startNew();
    }

    private List<Integer> list;

    private void createList(int size)
    {
        list = new ArrayList<Integer>();
        for (int i=0; i<size; i++)
        {
            list.add(i);
        }
    }

    public void startOld()
    {
        createList(10);

        for (int i = 0;i<list.size();i++)
        {
            System.out.println("Old: Entry "+list.get(i)+" of "+list);
            pause();

            list = list.subList(0, list.size()-1);
        }        
    }

    public void startNew()
    {
        createList(10);

        for (int a : list)
        {
            System.out.println("New: Entry "+a+" of "+list);
            pause();

            list = list.subList(0, list.size()-1);
        }        
    }

    private static void pause()
    {
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

}