public static void processCar(ArrayList<Car> cars){
       int totalAmount=0;
       for (int i=0; i<cars.size(); i++){
         totalAmount+= cars.get(i).computeCars(); 
       }
      System.out.println (totalAmount);
    }