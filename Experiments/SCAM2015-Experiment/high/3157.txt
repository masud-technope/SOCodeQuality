private static class SylvainSAlgo implements ItineraryAlgorithm {

    @Override
    public List<Integer> processItinerary(String[] towns) {

        List<Integer> itinerary = new ArrayList<Integer>();
        for (int i = 0; i<towns.length; i++) {
            for (int j = i + 1; j < towns.length; j++) {
                itinerary.add(Integer.valueOf(i));
                itinerary.add(Integer.valueOf(j));
            }
        }
        itinerary.add(Integer.valueOf(0));
        return itinerary;
    }
}