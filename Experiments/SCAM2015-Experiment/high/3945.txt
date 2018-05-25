File file =new File("myfile_in_test.java");

    if(file.exists()){

        final double bytes = file.length();
        final double kilobytes = (bytes / 1024);

        System.out.println("bytes : " + bytes);
        System.out.println("kilobytes : " + kilobytes);
    }else{
         System.out.println("File does not exists!");
    }