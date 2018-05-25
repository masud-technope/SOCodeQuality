try {
        final Connection conn = getConn(prefix);
        try {
            //code using conn
        } catch (Exception e) {

        } finally {
            closeConnection(conn);
        }
    } catch (DbHelperException e) {
        throw new DbHelperException("error opening connection", e);
    }