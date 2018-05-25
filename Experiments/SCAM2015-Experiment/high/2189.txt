public static Set<E> unique(Set<? extends E>... sets){
   Set<E> once = new HashSet<E>();
   Set<E> twice = new HashSet<E>();

   for(Set<? extends E> set:sets){
      for(E el:set){
         if(once.contains(el)){
            twice.add(el);
         } else {
            once.add(el);
         }
      }
   }

   once.removeAll(twice);
   return once;
}