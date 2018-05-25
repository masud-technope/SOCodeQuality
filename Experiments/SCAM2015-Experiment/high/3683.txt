private class MyListAdapter implements ListAdapter{

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView!=null){
             CheckedTextView textView = (CheckedTextView)convertView;
             textView.setText("the text for item "+position);
             textView.setTextColor(makeColorStateListForItem(position));
             return textView;
        }else{
             CheckedTextView textView = new CheckedTextView(parent.getContext());
             textView.setText("the text for item "+position);
             textView.setTextColor(makeColorStateListForItem(position));
             return textView;
        }
    }

    private ColorStateList makeColorStateListForItem(int position){
        int pressedColor = pressedColorForItem(position);
        int checkedColor = checkedColorForItem(position);
        int defaultColor = defaultColorForItem(position);
        ColorStateList colorStateList = new ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_pressed},
                        new int[]{android.R.attr.state_checked},
                        new int[]{0},
                },
                new int[]{
                        pressedColor, //use when state is pressed
                        checkedColor, //use when state is checked, but not pressed
                        defaultColor}); //used when state is not pressed, nor checked 
    }

    private int pressedColorForItem(int position){
        //write your business logic to determine color here
        return ...;
    }

    private int checkedColorForItem(int position){
        //write your business logic to determine color here
        return ...;
    }

    private int defaultColorForItem(int position){
        return Color.WHITE;
    }

    //all other adapter methods
    //...