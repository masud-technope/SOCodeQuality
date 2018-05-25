TextView textview = (TextView) findViewById(R.id.textview);

Intent in = getIntent();
String cuisine = in.getStringExtra("TAG_CUISINE_NAME");
String priceCategory = in.getStringExtra("TAG_PRICE_CATEGORY");

textview.setText(cuisine+","+priceCategory);