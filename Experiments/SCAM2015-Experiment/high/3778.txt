DateTime history = new DateTime( "1901-01-01", DateTimeZone.UTC ).withTimeAtStartOfDay();  // Technically, the call to withTimeAtStartOfDay is not necessary here as Joda-Time defaults to that for parsing a date-only string. But the call is a good habit and makes clear out intention.
DateTime today = new DateTime( DateTimeZone.UTC ).withTimeAtStartOfDay();

Duration duration = new Duration( history, today );
long millis = duration.getMillis(); // Use a long, not an int.
long seconds = ( millis / 1000L ); // Use a long, not an int. Maybe use BigDecimal or BigInteger if you want rounding.