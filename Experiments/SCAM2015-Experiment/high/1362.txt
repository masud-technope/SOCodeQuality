Connection conn;
try
{
    String[] tableNames = {"tableA", "tableB"};
    String[] createTableStmts = ... // read the CREATE TABLE SQL statements from a file into this String array. First statement is for the tableA, and so on.
    conn = DriverManager.getConnection("jdbc:derby:sampleDB;create=true");
    for(int ctr =0 ; ctr < tableNames.length; ctr++)
    {
        PreparedStatement pStmt = conn.prepareStatement("SELECT t.tablename FROM sys.systables t WHERE t.tablename = ?");
        pStmt.setString(1, tableNames[ctr]);
        ResultSet rs = pStmt.executeQuery();
        if(!rs.next())
        {
            // Create the table
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createTableStmts[ctr]);
            stmt.close();
        }
        rs.close();
        pStmt.close();
    }
}
catch (SQLException e)
{
    throw new RuntimeException("Problem starting the app...", e);
}