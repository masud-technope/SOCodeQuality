List list;
for(Object x: list) {
   if( x instanceof Foo) {
      Object fieldValue = ((Foo)x).fieldName;
   }
}