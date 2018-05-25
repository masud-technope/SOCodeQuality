// Prepare a statement to insert a record
String sql = "INSERT INTO TermsAndConditions (name,description,ownerID)  VALUES  (?,?,?)";
PreparedStatement pstmt = connection.prepareStatement(sql);

// Set the values
pstmt.setString(1, "bar condtions");
pstmt.setString(2, "Don't be stealin my stuff");
pstmt.setString(3, "2");

// Insert the row
pstmt.executeUpdate();