Enumeration myEnumerate(final Object array[]) {
        class E implements Enumeration {
            int count = 0;
            public boolean hasMoreElements()
                { return count < array.length; }
            public Object nextElement() {
                { return array[count++]; }
        }
        return new E();
    }