///
/// Try to drop a database
///
try
{
    connection.Open();

    command.CommandText = "drop database Nothwind";

    command.ExecuteNonQuery();
}