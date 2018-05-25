try{
    try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hrdb", "obiwan", "kenobi"); 
        Statement stm = conn.createStatement(); 
        ResultSet rs = stm.executeQuery("select name from department")) {

        while(rs.next()){
            System.out.println(rs.getString("name"));
        }

    } 
}catch(SQLException e){
    //you might wanna check e.getSuppressed() as well
    //log, wrap, rethrow as desired.
}