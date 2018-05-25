boolean listIsFull=false;
class FillListWorker extends SwingWorker<Foo,Bar>
{
    ...
    protected void done()
    {
        synchronized (listYouveBeenFilling)
        {
            listIsFull=true;
            listYouveBeenFilling.notifyAll();
        }
    }
    ...
}

class DoStuffToListListWorker extends SwingWorker<Foo,Bar>
{
    ...
    protected Foo doInBackground()
    {
        synchronized (listYouveBeenFilling)
        {
            while (!listIsFull)
            {
                try
                {
                    listYouveBeenFilling.wait();
                }
                catch (InterruptedException ie)
                {
                    // Don't worry, we'll just wait again
                }
            }
        }
    }
    ...
}