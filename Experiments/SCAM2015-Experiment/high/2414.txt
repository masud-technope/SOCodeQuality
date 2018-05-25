@Override
public void onStart() { 
    // This MUST be called first! Otherwise the view tweaking will not be present in the displayed Dialog (most likely overriden)
    super.onStart();

    forceWrapContent(myCustomView);
}