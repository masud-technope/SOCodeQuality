@Override
protected void onListItemClick(ListView l, View v, int position, long id) {
    super.onListItemClick(l, v, position, id);

    if (v != null){
        TextView textView = (TextView)v.findViewById(R.id.tId);
        Log.e("idthatclicked",textView.getText().toString());
    }
}