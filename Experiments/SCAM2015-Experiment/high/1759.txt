private OnScrollListener onScrollListener = new OnScrollListener() {

    private int previousFirstVisibleItem = 0;
    private long previousEventTime = 0;
    private double speed = 0;

    @Override
    public void onScroll(HtcAbsListView view, int firstVisibleItem,
            int visibleItemCount, int totalItemCount) {

        if (previousFirstVisibleItem != firstVisibleItem){
            long currTime = System.currentTimeMillis();
            long timeToScrollOneElement = currTime - previousEventTime;
            speed = ((double)1/timeToScrollOneElement)*1000;

            previousFirstVisibleItem = firstVisibleItem;
            previousEventTime = currTime;

            Log.d("DBG", "Speed: " +speed + " elements/second");
        }

    }

    @Override
    public void onScrollStateChanged(HtcAbsListView view, int scrollState) {
    }
};