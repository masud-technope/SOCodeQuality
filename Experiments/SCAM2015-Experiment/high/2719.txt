public static void listFiles() {

        File f = new File("C:/"); // use here your file directory path
        String[] allFiles = f.list(new MyFilter ());
        for (String filez:allFiles ) {
            System.out.println(filez);
        }
    }
}
        class MyFilter implements FilenameFilter {
        @Override
        //return true if find a file named "a",change this name according to your file name
        public boolean accept(final File dir, final String name) {
            return ((name.startsWith("a") && name.endsWith(".jpg"))|(name.startsWith("a") && name.endsWith(".txt"))|(name.startsWith("a") && name.endsWith(".mp3")|(name.startsWith("a") && name.endsWith(".mp4"))));

        }
    }