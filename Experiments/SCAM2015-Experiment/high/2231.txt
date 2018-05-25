private String someText;

// ...

@Override
public String getTitle()
{
    Activity a = getVoTts().getActivity();
    a.runOnUiThread(new Runnable()
    {
        public void run()
        {  
            someText = VoWebView.super.getTitle();
        }
    });
}