public boolean insertPoints(ArrayList<Point> arr)
    {
        try
        {
            con = this.getConnection();
            st = con.createStatement();
            if (con != null)
            {
                boolean success = true;
                for (int i = 0; i < arr.size(); i++)
                {
                    String id = arr.get(i).getId();
                    String x = arr.get(i).getXcoordinate();
                    String y = arr.get(i).getYcoordinate();
                    if (st.executeUpdate("INSERT INTO table (Id, X, Y) VALUES (" + id + "," + x + "," + y + ")") > 0)
                    {
                        continue;
                    }
                    else
                    {
                        success = false;
                        break;
                    }
                }
                return success;
            }
            else
            {
                System.err.println("No connection, con == null ...");
                return false;
            }
        }
        catch (Exception e)
        {
            System.err.println("Exception: " + e.getMessage());
            return false;
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            }
            catch (SQLException sqle)
            {
                System.err.println("SQLException: " + sqle.getMessage());
            }
        }
        return false;
    }