public class DateAndTime {
  final String date;
  final String time;
  public DateAndTime(String date, String time) {
    this.date = date;
    this.time = time;
  }
  @Override
  public String toString() {
    return "Date of Order: " + date +
      "Time of Order: " + time +
      "=============================================";
  }
}