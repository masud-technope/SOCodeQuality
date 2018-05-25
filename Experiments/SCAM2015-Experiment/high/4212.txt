private static ThreadLocal<SimpleDateFormat> fmtHolder = new ThreadLocal<SimpleDateFormat>() {
  @Override protected SimpleDateFormat initialValue() {
    return new SimpleDateFormat("dd/MM/yyyy");
  }
};

private void method() {
  SimpleDateFormat fmt = fmtHolder.get();
}