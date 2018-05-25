isprimenumber = true;
    for (int j = 2; j < i; j++) {
        if (i % j == 0) {
            // No PrimeNumber
            isprimenumber = false;
        } 
            // If it's non-zero, don't set isprimenumber to true, because if we
            // set it to false earlier, then it still should be false! 

    }

    // And wait until we've tested all the j's before we can tell if it's true.
    if (isprimenumber) {
    }