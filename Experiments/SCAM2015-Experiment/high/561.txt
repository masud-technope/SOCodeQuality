public void foo() throws Exception e {

  Statement stmt = null ; 
  try {
    stmt = createStatement();
    doSomething(stmt);
  } finally {
    if(stmt != null) 
      stmt.close();
  }
}