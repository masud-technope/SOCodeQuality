Resources res = getResources();
for (int i = 0; i < ListOfView.size(); i++){
    int id = ListOfView.get(i).getId();
    try {
        Log.i("View ", res.getResourceName(id));
    } catch (Resources.NotFoundException e) {
        Log.i("Unknown id " + id);
    }
}