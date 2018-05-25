anim2.setAnimationListener(new Animation.AnimationListener(){
    @Override
    public void onAnimationStart(Animation arg0) {
    }           

    @Override
    public void onAnimationRepeat(Animation arg0) {
    }           

    @Override
    public void onAnimationEnd(Animation arg0) {
        againbtn.setVisibility(View.GONE);  //set your button visibility here
    }


});