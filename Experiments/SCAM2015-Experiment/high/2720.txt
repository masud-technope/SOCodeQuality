public static void filelist()
    {
        File folder = new File("C:/");
        File[] listOfFiles = folder.listFiles();

    for (File file : listOfFiles)
    {
        if (file.isFile())
        {
            String[] filename = file.getName().split("\\.(?=[^\\.]+$)"); //split filename from it's extension
            if(filename[0].equalsIgnoreCase("a")) //matching defined filename
                System.out.println("File exist: "+filename[0]+"."+filename[1]); // match occures.Apply any condition what you need
        }
     }
}