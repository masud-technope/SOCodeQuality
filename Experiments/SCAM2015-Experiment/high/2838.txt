public Rectangle smallestArea()
   {        
       if (list.size() == 0) return null;

       Rectangle smallest = list.get(0);           
       double smallestArea = smallest.getWidth() * smallest.getHeight();

       for (int i = 1; i < list.size(); i++) {
           Rectangle next = list.get(i);
           double nextArea = next.getWidth() * next.getHeight();

           if ((nextArea - smallestArea) < 0) { 
             smallest = next;         // <- Whenever you've updated smallest           
             smallestArea = nextArea; // <- Do not forget updating the smallestArea as well
           }  
       }

       return smallest;
   }