import com.sun.jna.Library;
import com.sun.jna.Native;

class Link {

    private static final C c =
        (C) Native.loadLibrary("c", C.class);

    private static interface C extends Library {

        /** see man 2 link */
        public int link(String oldpath, String newpath);
    }

    @Override
    protected void hardLink(String from, String to) {
        c.link(to, from);
    }
}