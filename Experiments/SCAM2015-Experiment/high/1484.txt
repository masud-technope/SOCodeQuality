public Money(Currency currency, int dollar, int cents) {
    this.currency = currency;
    this.dollar = dollar;
    // validate that cents is 0 to 99
    if (cents < 0 || cents > 99) {
        throw new IllegalArgumentException("Invalid cents value: " + cents);
    }
    this.cents = cents;
}