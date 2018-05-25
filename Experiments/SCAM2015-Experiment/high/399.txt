for (interface obj: myList) {
   if(obj instanceof A)
      doSomething((A) obj);
   else if(obj instanceof B)
      doSomething((B) obj);
   else
      doSomething(obj); // Calls the method receiving Interface
}