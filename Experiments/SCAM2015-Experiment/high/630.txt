public static String oldestFile() {
    Vector list = null;
    int currentOldestTime;
    int nextTime = 2140000000; //Made very big for future-proofing
    ChannelSftp.LsEntry lsEntry = null;
    SftpATTRS attrs = null;
    String nextName = null;
    try {
        list = Main.chanSftp.ls("*.xml");
        if (list.isEmpty()) {
            fileFound = false;
        }
        else {
            lsEntry = (ChannelSftp.LsEntry) list.firstElement();
            oldestFile = lsEntry.getFilename();
            attrs = lsEntry.getAttrs();
            currentOldestTime = attrs.getMTime();
            for (Object sftpFile : list) {
                lsEntry = (ChannelSftp.LsEntry) sftpFile;
                nextName = lsEntry.getFilename();
                attrs = lsEntry.getAttrs();
                nextTime = attrs.getMTime();
                if (nextTime < currentOldestTime) {
                    oldestFile = nextName;
                    currentOldestTime = nextTime;
                }
            }
            attrs = chanSftp.lstat(Main.oldestFile);
            long size1 = attrs.getSize();
            System.out.println("-Ensuring file is not being written to (waiting 1 minute)");
            Thread.sleep(60000); //Wait a minute to make sure the file size isn't changing
            attrs = chanSftp.lstat(Main.oldestFile);
            long size2 = attrs.getSize();
            if (size1 == size2) {
                System.out.println("-It isn't.");
                fileFound = true;
            }
            else {
                System.out.println("-It is.");
                fileFound = false;
            }
        }
    } catch (Exception ex) {ex.printStackTrace();}
    return Main.oldestFile;
}