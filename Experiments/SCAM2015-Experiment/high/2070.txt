Man fred = null;
   try {
      fred = new Man();
    } catch (Exception e) {
      System.out.println(e.printStackTrace());
    } finally {
       //You could do some clean up.
    }

    if(fred != null) {
      System.out.println(fred.getName());
    }