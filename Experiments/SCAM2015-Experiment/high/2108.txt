protected void onCreate(Bundle arg0)
{
    super.onCreate(arg0);

    // allow window to show progress spinner in the action bar
    requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
    getSupportActionBar();
    setSupportProgressBarIndeterminateVisibility(false); 
}