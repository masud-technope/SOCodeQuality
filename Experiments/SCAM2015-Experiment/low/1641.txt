private static String findMin(String[] list) {
    String minState = list[0]; 
    for(int i=1; i<list.length; i++){
        String min=list[i];
        minState=(min!=null&&min.compareTo(minState)<0)?min:minState;
    }
    return minState;
}