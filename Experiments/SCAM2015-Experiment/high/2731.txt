// ...
    for (int i = 0, i < 2; i++ ) { // loop to have several copies
        if (i == copy) {
            return new Enumeration() {
                int count = 0;
                public boolean hasMoreElements()
                    { return count < array.length; }
                public Object nextElement() {
                    { return array[count++]; }
            } // we hope to be done... oh no
        }

        array = null; // not final => can change
    }