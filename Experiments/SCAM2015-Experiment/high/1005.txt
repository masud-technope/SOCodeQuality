public Long save(final byte[] blob) {
  KeyHolder keyHolder = new GeneratedKeyHolder();
  String sql = "insert into blobtest (myblob) values (?)"; //requires auto increment column based on triggers
  getSimpleJdbcTemplate().getJdbcOperations().update(new AbstractLobPreparedStatementCreator(lobHandler, sql, "ID") {
    @Override
    protected void setValues(PreparedStatement ps, LobCreator lobCreator) throws SQLException, DataAccessException {
      lobCreator.setBlobAsBytes(ps, 1, blob);
    }
  }, keyHolder);

  Long newId = keyHolder.getKey().longValue();
  return newId;
}