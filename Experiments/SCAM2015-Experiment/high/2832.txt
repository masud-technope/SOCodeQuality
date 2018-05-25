String sql = "INSERT INTO temp(val) VALUES (?)";
PreparedStatement st = con.prepareStatement(sql);
if (/* int value is not null */) {
   st.setInt(1, value);
} else {
   set.setNull(1, Types.INTEGER);
}
count  = st.executeUpdate();