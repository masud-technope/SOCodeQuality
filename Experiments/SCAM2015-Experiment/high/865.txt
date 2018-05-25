Cat cat = iter.next();
feedDryFood(cat);

boolean shouldGetTuna = !iter.hasNext();
if (shouldGetTuna) 
    alsoFeedTuna(cat)