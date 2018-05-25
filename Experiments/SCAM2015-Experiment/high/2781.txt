ArrayList<Double[]> results = Lists.newArrayList();
    for( String s : list1 ) {
        String[] splitStrings = s.split(",");
        Double[] doublesForCurrentString = new Double[splitStrings.length];
        for(int i=0; i<splitStrings.length; i++){
            try {
                doublesForCurrentString[i] = Double.valueOf(splitStrings[i]);
            } catch( NumberFormatException ex ) {
                // No action.
            }
        }
        results.add(doublesForCurrentString);
    }
    Double[][] doubleArray = (Double[][])results.toArray();