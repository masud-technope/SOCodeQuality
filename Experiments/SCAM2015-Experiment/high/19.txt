boolean exceptionThrown = true;
try {
   mightThrowAnException();
   exceptionThrown = false;
} finally {
   if (exceptionThrown) {
      // Whatever you want to do
   }
}