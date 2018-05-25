for (final CityDetail cityDetail : cityDetailsArray) {
    OnClickListener rowClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            showDetailsView(cityDetail);
        }
    };
    row.setOnClickListener(rowClickListener);
    //rest of the loop
}