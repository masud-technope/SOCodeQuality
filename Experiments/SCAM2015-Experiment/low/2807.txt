Class.forName("com.mysql.jdbc.Driver");
Connection connect = DriverManager
      .getConnection("jdbc:mysql://localhost/dbname?"
          + "user=myusername&password=mypassword");
PreparedStatement preparedStatement = connect
      .prepareStatement("select * from employees");
 ResultSet resultSet = preparedStatement.executeQuery();

while (resultSet.next()) {
  //display text
}
preparedStatement.close();
connect.close();