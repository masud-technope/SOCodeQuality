String query = "select username from login where username=? and password=?";
Connection connection = null;
PreparedStatement statement = null;
ResultSet resultSet = null;

try {
    connection = getConnection();
    statement = connection.prepareStatement(query);
    statement.setString(1, user);
    statement.setString(2, pass);
    resultSet = statement.executeQuery();

    if (resultSet.next()) {
        response.sendRedirect("LoginSuccess.jsp");
    } else {
        request.setAttribute("message", "retry");
    }
} catch (SQLException e) {
    throw new ServletException("DB interaction failed", e);
} finally {
    if (resultSet != null) try { resultSet.close(); } catch (SQLException ignore) {}
    if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
    if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
}