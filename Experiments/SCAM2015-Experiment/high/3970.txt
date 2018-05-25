Date newDate;
while (true) {
    c.add(Calendar.DATE, frequency); // Adding 5 days
    newDate = c.getTime();

    if (newDate.compareTo(endDate) <= 0) {
        list.add(newDate);
    } else {
        break;
    }
}