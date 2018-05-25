public void copyFilesAndStore(File[] files, DataObject additionalData){ 

    List<IOException> encounteredExceptions = new LinkedList<IOException>(); 

    for (File f in files){ 
        try { 
            copyFileToDestination(f); 
        } catch (IOException ex) { 
            log(ex); 
            encounteredExceptions.add(ex); 
        } 
    } 

    updateDatabase(additionalData); 

    if (!encounteredExceptions.empty()) {
        throw(new DelayedException(encounteredExceptions)); 
    }
}