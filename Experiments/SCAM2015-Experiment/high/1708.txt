catch (InvocationTargetException e) {
    if (e.getCause() instanceof Exception) {
        throw (Exception) e.getCause();
    }
    else {
        // decide what you want to do. The cause is probably an error, or it's null.
    }
}