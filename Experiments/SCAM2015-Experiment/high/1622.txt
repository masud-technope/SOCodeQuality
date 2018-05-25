protected String getResourceURL(int resourceId, String extension) {
    String resName = getResources().getResourceName(resourceId);
    int index = resName.indexOf("/");
    resName = resName.substring(0, index);
    index = resName.indexOf(":");
    String resType = resName.substring(index + 1);

    StringBuilder link = new StringBuilder(128);
    link.append("file:///android_res/");
    link.append(resType).append("/");
    link.append(getResources().getResourceEntryName(resourceId));
    link.append(".").append(extension);
    return link.toString();
}