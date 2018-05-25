public static void readData() throws IOException
{
    File file = new File(path, filename);

    if (!file.isFile() && !file.createNewFile())
    {
        throw new IOException("Error creating new file: " + file.getAbsolutePath());
    }

    BufferedReader r = new BufferedReader(new FileReader(file));

    try 
    {
        // read data
    }finally
    {
        r.close();
    }
}