public void shuffle() {
    // no need the shuffle the last card.
    shuffle(deck.length - 1);
}

// will leave the first N card random without duplicates.
public void shuffle(int numberOfCards) {
    for(int i = 0; i < numberOfCards; i++) {
        // pick a random card from the rest of the deck
        int j = rand.nextInt(protoDeck.length - i) + i;
        // swap cards
        Card tmp = deck[i];
        deck[i] = deck[j];
        deck[j] = tmp;
    }
}