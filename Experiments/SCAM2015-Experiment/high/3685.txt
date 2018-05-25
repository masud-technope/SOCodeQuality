private Drawable makeBackgroungForItem(int position){
    int pressedColor = pressedBackgroundColorForItem(position);
    int checkedColor = checkedBackgroundColorForItem(position);
    int defaultColor = defaultBackgroundColorForItem(position);
    StateListDrawable stateListDrawable = new StateListDrawable();
    stateListDrawable.addState(new int[]{android.R.attr.state_list_pressed}, new ColorDrawable(pressedColor));
    stateListDrawable.addState(new int[]{android.R.attr.state_list_checked}, new ColorDrawable(checkedColor));
    stateListDrawable.addState(new int[]{0, new ColorDrawable(defaultColor));
    return stateListDrawable;
}