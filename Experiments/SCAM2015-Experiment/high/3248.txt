// Create the database table if it doesn't exist
protected final static void dbTableCreate(final Context ctx)
{
    SQLiteDatabase db = null;
    try
    {
        db = ctx.openOrCreateDatabase(DB_NAME, Context.MODE_PRIVATE, null);
        db.execSQL
        (
            "CREATE TABLE IF NOT EXISTS " + DB_TABLE +
            " (date DATETIME PRIMARY KEY NOT NULL DEFAULT (CURRENT_DATE), " +
            "score INTEGER DEFAULT (null));"
        );
    }
    catch (final SQLiteException se)
    {
        System.out.println
        (
            ctx.getClass().getSimpleName() + "\n" +
                "Could not create the database"
        );
        se.printStackTrace();
    }
    finally
    {
        db.close();
    }
}