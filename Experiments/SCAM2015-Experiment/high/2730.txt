Enumeration myEnumerate(Object array[], int copy) { // array not final, let's see...
    for (int i = 0, i < 2; i++ ) { // loop to have several copies
        class E implements Enumeration {
            int count = 0;
            public boolean hasMoreElements()
                { return count < array.length; }
            public Object nextElement() {
                { return array[count++]; }
        } // we hope to be done with E... oh no 

        array = null; // not final => can change

        if (i == copy) {
            return new E(); // we need to look outside of E
            // to figure value of array it uses
        }
    }
    return null;
}