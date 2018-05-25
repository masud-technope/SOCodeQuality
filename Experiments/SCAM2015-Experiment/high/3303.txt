public static void addItem(List<String> list, int k){
    int size = list.size() * k;

    for (int i=0; i<size; i=i+k){
        String s = list.get(i);
        for (int j=0; j<k-1; j++){
            list.add(i+j, s);
        }
    }
}