/**
 * Ensures that the <code>close</code> method of this file input stream is
 * called when there are no more references to it.
 *
 * @exception  IOException  if an I/O error occurs.
 * @see        java.io.FileInputStream#close()
 */
protected void finalize() throws IOException {
    if ((fd != null) &&  (fd != FileDescriptor.in)) {

        /*
         * Finalizer should not release the FileDescriptor if another
         * stream is still using it. If the user directly invokes
         * close() then the FileDescriptor is also released.
         */
        runningFinalize.set(Boolean.TRUE);
        try {
            close();
        } finally {
            runningFinalize.set(Boolean.FALSE);
        }
    }
}