boolean first = true;
for(String x: list1){
    for(String y: list2){
        if(x.equalsIgnoreCase(y)){
           if (first) {
               first = false;
           } else {
               System.out.print(", "); // <-- or " ," if you prefer.
           }
           System.out.print(list1.indexOf(x));
        }
    }
}