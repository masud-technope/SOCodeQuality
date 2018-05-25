Man Fred = null;
    try {
      Fred = new Man();
    } catch (exception e) {
      print e 
    } finally {
       //You could do some clean up.
    }

    if(Fred != null) {
      print Fred.getName();
    }