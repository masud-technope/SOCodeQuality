///
/// Due to insufficient priviligies we couldn't do it, an exception was thrown
///
catch(Exception ex)
{
    transaction.Rollback();
}