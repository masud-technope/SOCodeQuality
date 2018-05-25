boolean processClick=true;
someButton.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {
        if(processClick)
         {
        someButton.setEnabled(false);
        someButton.setClickable(false);
        someButton.setVisibility(View.GONE);
        performTaskOnce();
         }
        processClick=false; 
        }
    });

private void performTaskOnce() {
    Log.i("myapp", "Performing task");
    //Do something nontrivial that takes a few ms (like changing the view hierarchy)
}