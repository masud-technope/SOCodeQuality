/**
     * This method searches for key in the array of String , starts looking from fromIndexSpecified
     * @param source
     * @param key
     * @param fromIndex
     * @return
     */
    private static int findIndexOfKey(String[] source, String key, int fromIndex) {

        if (fromIndex > source.length) {
            return -1;// invalid arg ..can also throw IlligleArgumentException
        }
        for (int index = fromIndex; index < source.length; index++) {
            if (source[index].indexOf(key) > -1) {
                return index;//found..!
            }
        }
        return -1; //no match found
    }