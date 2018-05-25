// Used to filter out non-directory files.
// This might need to filter '.' and '..' out, not sure whether they're returned.
public class DirectoryFilter implements FileFilter {
    public boolean accept(File file) {
        return file.isDirectory();
    }
}


// Add this at the end of your testForDirectoryChange method
for(File dir: myDir.toFile().listFiles(new DirectoryFilter())) {
    testForDirectoryChange(dir.toPath());
}