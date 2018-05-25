static <T> QueryHelper getQueryHelper (Class<T> expectedReturn) {
    if (expectedReturn.isInstance (SomeRelatedClass.class))
      return query1;
    else
      return query2;
}