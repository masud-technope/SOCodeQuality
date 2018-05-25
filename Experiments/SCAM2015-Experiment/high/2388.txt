public static Resource getInstance(){
   Resource reordered = resource;
   if(resource != null){
       return reordered;
   }
   return (resource = new Resource());
}