PreparedStatement st = connection.prepareStatement("select * from Members where username = ? ");
    st.setString(1, username);
    ResultSet r1=st.executeQuery();
    if(r1.next()){
         System.out.println('user already exist in database!");
    }
    else{
        //Add to database
    }