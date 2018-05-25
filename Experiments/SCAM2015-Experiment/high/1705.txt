OnClickListener mVisibleListener = new OnClickListener() {
    public void onClick(View v) {

        if( mText.getVisibility() == View.INVISIBLE )
            mText.setVisibility(View.VISIBLE);
        else
            mText.setVisibility(View.INVISIBLE);

        if( mRule1.getVisibility() == View.INVISIBLE )
            mRule1.setVisibility(View.VISIBLE);
        else
            mRule1.setVisibility(View.INVISIBLE);

        if( mRule2.getVisibility() == View.INVISIBLE )
            mRule2.setVisibility(View.VISIBLE);
        else
            mRule2.setVisibility(View.INVISIBLE);
    }
};