final ImageView alertStatus = (ImageView) v
                    .findViewById(R.id.alertStatus);

if (condition){
     alertStatus.setVisibility(View.VISIBLE);
}
else{
     alertStatus.setVisibility(View.INVISIBLE);
}