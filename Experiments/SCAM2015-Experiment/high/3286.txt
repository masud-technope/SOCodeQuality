public static boolean CheckUsernameExists(String username){

    boolean usernameExists = false;
    try{
        PreparedStatement st = connection.prepareStatement("select * from Members where username = ? ");
        st.setString(1, username);
        ResultSet r1=st.executeQuery();
        if(r1.next()){
           usernameExists = true;
        }
    catch (Exception e) {
        System.out.println("SQL Exception: "+ e.toString());
    }
    return usernameExists;
}