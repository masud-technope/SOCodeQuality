final ListView listView = ...
listView.setAdapter(new MyListAdapter());
listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        listView.setItemChecked(position,true);
    }
});