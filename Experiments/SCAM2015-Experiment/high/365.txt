public class MyBean {
  private Date startDate;
  private Date endDate;

  @AssertTrue public boolean isValidRange() {
    // TODO: null checks
    return endDate.compareTo(startDate) >= 0;
  }