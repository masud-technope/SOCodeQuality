///
/// Clean up the resources
///
finally
{

    connection.Close();
    transaction = null;
    command = null;
    connection = null;
}