import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringTree {

    public static void main(String[] args) {

    List<String> folders = new ArrayList<String>();
    folders.add("folder a/folder b/file 1");
    folders.add("folder a/folder b/file 2");
    folders.add("folder a/folder c");
    // for a non-lexically sorted folder list
    Collections.sort(folders);

    Map<Integer, String> map = new HashMap<Integer, String>();
    for (String path : folders) {
        String[] parsedPath = path.split("/");
        boolean newBranch = false;
        for (int i = 0; i < parsedPath.length; i++) {
        newBranch |= !parsedPath[i].equals(map.get(i));
        if (newBranch) {
            map.put(i, parsedPath[i]);
            print(i, parsedPath[i]);
        }
        }
    }
    }

    private static void print(int level, String item) {
    String tab = "";
    for (int i = 0; i < level; i++)
        tab = tab + ((i == 0) ? "| " : "|- ");
    System.out.println(tab + item);
    }

}