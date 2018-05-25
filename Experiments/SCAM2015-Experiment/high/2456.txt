public static ArrayList<Color> ColorList(int numOfColors) {
    ArrayList<Color> colorList = new ArrayList<Color>();
    for (int i = 0; i < numOfColors; i++) {
        Color c = RandColor();
        boolean similarFound = false;
        for(Color color : colorList){
            if(color.similarTo(c)){
                 similarFound = true;
                 break;
            }
        }
        if(!similarFound){
            colorList.add(c);
        } 

    }
    return colorList;
}