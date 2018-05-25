DateTime first = ...;
DateTime second = ...;

LocalDate firstDate = first.toLocalDate();
LocalDate secondDate = second.toLocalDate();

return firstDate.compareTo(secondDate);