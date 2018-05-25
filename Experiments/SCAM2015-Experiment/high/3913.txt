public class CustomPagerAdapter extends PagerAdapter {

    private int mPageCount;

    /**
     * 
     * @param pageCount
     */
    public CustomPagerAdapter(int pageCount) {
        this.mPageCount = pageCount;
    }

    @Override
    public int getCount() {
        return mPageCount;
    }

}