boolean addList = false;

@Override
protected void onResume() {
    FragmentTransaction tx = this.getSupportFragmentManager().beginTransaction();
    if (this.addList) {
        ListFragment list = this.getListFragment();
        tx.add(R.id.MainFragmentContainer, list, "list_fragment_tag");
    }

    tx.commit();
    super.onResume();

    this.addList = false;   

}

@Override
protected void onPause() {
    this.addList = this.getListFragment().isAdded();
    ...
    if (this.addList) {
        FragmentTransaction tx = this.getSupportFragmentManager().beginTransaction();
        tx.remove(this.getListFragment());
        tx.commit();
    }
    this.getSupportFragmentManager().executePendingTransactions();
    super.onPause();

}