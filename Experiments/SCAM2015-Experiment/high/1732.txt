public void calculation(Response response) { 
    Exception e = null;

    try {
        // Do something here
    } catch (IOException ioe) {
        e = ioe;
    }

    if(e == null) {
        response.onSuccess();
    } else {
        response.onFailure(e);
    }
}